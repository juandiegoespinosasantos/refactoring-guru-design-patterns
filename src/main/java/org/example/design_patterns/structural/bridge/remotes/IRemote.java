package org.example.design_patterns.structural.bridge.remotes;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 19, 2023
 * @see <a href="https://refactoring.guru/design-patterns/bridge">https://refactoring.guru/design-patterns/bridge</a>
 * @since 17
 */
public interface IRemote {

    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
