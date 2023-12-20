package org.example.design_patterns.structural.bridge.remotes;

import org.example.design_patterns.structural.bridge.devices.IDevice;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 19, 2023
 * @see <a href="https://refactoring.guru/design-patterns/bridge">https://refactoring.guru/design-patterns/bridge</a>
 * @since 17
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(IDevice device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");

        device.setVolume(0);
    }
}
