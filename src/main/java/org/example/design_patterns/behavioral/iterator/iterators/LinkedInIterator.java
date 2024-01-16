package org.example.design_patterns.behavioral.iterator.iterators;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.example.design_patterns.behavioral.iterator.profile.Profile;
import org.example.design_patterns.behavioral.iterator.social_networks.LinkedIn;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 15, 2024
 * @see <a href="https://refactoring.guru/design-patterns/iterator">https://refactoring.guru/design-patterns/iterator</a>
 * @since 17
 */
@AllArgsConstructor
public class LinkedInIterator implements IProfileIterator {

    private LinkedIn linkedIn;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> contacts = new ArrayList<>();

    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
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
        Profile friendContact = contacts.get(currentPosition);

        if (friendContact == null) {
            friendContact = linkedIn.requestContactInfoFromLinkedInAPI(friendEmail);
            contacts.set(currentPosition, friendContact);
        }

        currentPosition++;

        return friendContact;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }

    private void lazyLoad() {
        if (emails.isEmpty()) {
            linkedIn.requestRelatedContactsFromLinkedInAPI(email, type)
                    .forEach(contact -> {
                        emails.add(contact);
                        contacts.add(null);
                    });
        }
    }
}