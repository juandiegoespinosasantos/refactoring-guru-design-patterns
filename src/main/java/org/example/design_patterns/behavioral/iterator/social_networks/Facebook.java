package org.example.design_patterns.behavioral.iterator.social_networks;

import java.util.ArrayList;
import java.util.List;
import org.example.design_patterns.behavioral.iterator.iterators.FacebookIterator;
import org.example.design_patterns.behavioral.iterator.iterators.IProfileIterator;
import org.example.design_patterns.behavioral.iterator.profile.Profile;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 15, 2024
 * @see <a href="https://refactoring.guru/design-patterns/iterator">https://refactoring.guru/design-patterns/iterator</a>
 * @since 17
 */
public class Facebook implements ISocialNetwork {

    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        profiles = (cache == null) ? new ArrayList<>() : cache;
    }

    @Override
    public IProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public IProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }

    public Profile requestProfileFromFacebook(final String profileEmail) {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();

        System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(final String profileEmail, final String contactType) {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();

        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // ...and return test data.
        Profile profile = findProfile(profileEmail);

        return (profile == null) ? null : profile.getContacts(contactType);
    }

    private Profile findProfile(final String profileEmail) {
        return profiles.stream()
                .filter(profile -> profile.getEmail().equals(profileEmail))
                .findFirst()
                .orElse(null);
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2_500L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}