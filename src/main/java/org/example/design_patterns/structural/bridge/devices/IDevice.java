package org.example.design_patterns.structural.bridge.devices;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 19, 2023
 * @see <a href="https://refactoring.guru/design-patterns/bridge">https://refactoring.guru/design-patterns/bridge</a>
 * @since 17
 */
public interface IDevice {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}