package org.example.design_patterns.behavioral.iterator.social_networks;

import org.example.design_patterns.behavioral.iterator.iterators.IProfileIterator;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 15, 2024
 * @see <a href="https://refactoring.guru/design-patterns/iterator">https://refactoring.guru/design-patterns/iterator</a>
 * @since 17
 */
public interface ISocialNetwork {

    IProfileIterator createFriendsIterator(String profileEmail);

    IProfileIterator createCoworkersIterator(String profileEmail);
}