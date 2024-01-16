package org.example.design_patterns.behavioral.iterator.iterators;

import org.example.design_patterns.behavioral.iterator.profile.Profile;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 15, 2024
 * @see <a href="https://refactoring.guru/design-patterns/iterator">https://refactoring.guru/design-patterns/iterator</a>
 * @since 17
 */
public interface IProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}