package org.example.design_patterns.behavioral.iterator.social_networks;

import java.util.ArrayList;
import java.util.List;
import org.example.design_patterns.behavioral.iterator.iterators.IProfileIterator;
import org.example.design_patterns.behavioral.iterator.iterators.LinkedInIterator;
import org.example.design_patterns.behavioral.iterator.profile.Profile;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 15, 2024
 * @see <a href="https://refactoring.guru/design-patterns/iterator">https://refactoring.guru/design-patterns/iterator</a>
 * @since 17
 */
public class LinkedIn implements ISocialNetwork {

    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache) {
        contacts = (cache == null) ? new ArrayList<>() : cache;
    }

    @Override
    public IProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public IProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
        // Here would be a POST request to one of the LinkedIn API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();

        System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {
        // Here would be a POST request to one of the LinkedIn API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life.
        simulateNetworkLatency();

        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // ...and return test data.
        Profile profile = findContact(profileEmail);

        return (profile == null) ? null : profile.getContacts(contactType);
    }

    private Profile findContact(String profileEmail) {
        return contacts.stream()
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