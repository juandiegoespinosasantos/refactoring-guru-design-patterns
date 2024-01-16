package org.example.design_patterns.behavioral.iterator.spammer;

import org.example.design_patterns.behavioral.iterator.iterators.IProfileIterator;
import org.example.design_patterns.behavioral.iterator.profile.Profile;
import org.example.design_patterns.behavioral.iterator.social_networks.ISocialNetwork;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 15, 2024
 * @see <a href="https://refactoring.guru/design-patterns/iterator">https://refactoring.guru/design-patterns/iterator</a>
 * @since 17
 */
public class SocialSpammer {

    public ISocialNetwork network;
    public IProfileIterator iterator;

    public SocialSpammer(ISocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriends(final String profileEmail, final String message) {
        System.out.println("\nIterating over friends...\n");

        iterator = network.createFriendsIterator(profileEmail);

        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(final String profileEmail, final String message) {
        System.out.println("\nIterating over coworkers...\n");

        iterator = network.createCoworkersIterator(profileEmail);

        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(final String email, final String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}