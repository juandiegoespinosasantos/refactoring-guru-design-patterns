package org.example.design_patterns.behavioral.iterator.iterators;

import java.util.ArrayList;
import java.util.List;
import org.example.design_patterns.behavioral.iterator.profile.Profile;
import org.example.design_patterns.behavioral.iterator.social_networks.Facebook;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 15, 2024
 * @see <a href="https://refactoring.guru/design-patterns/iterator">https://refactoring.guru/design-patterns/iterator</a>
 * @since 17
 */
public class FacebookIterator implements IProfileIterator {

    private Facebook facebook;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    @Override
    public boolean hasNext() {
        lazyLoad();

        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) return null;

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);

        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }

        currentPosition++;

        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }

    private void lazyLoad() {
        if (emails.isEmpty()) {
            facebook.requestProfileFriendsFromFacebook(email, type)
                    .forEach(profile -> {
                        emails.add(profile);
                        profiles.add(null);
                    });
        }
    }
}