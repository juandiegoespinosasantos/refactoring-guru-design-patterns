package org.example.design_patterns.structural.bridge;

import org.example.design_patterns.structural.bridge.devices.IDevice;
import org.example.design_patterns.structural.bridge.devices.Radio;
import org.example.design_patterns.structural.bridge.devices.Tv;
import org.example.design_patterns.structural.bridge.remotes.AdvancedRemote;
import org.example.design_patterns.structural.bridge.remotes.BasicRemote;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 19, 2023
 * @see <a href="https://refactoring.guru/design-patterns/bridge">https://refactoring.guru/design-patterns/bridge</a>
 * @since 17
 */
public class BridgeDemo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(final IDevice device) {
        System.out.println("Tests with basic remote");

        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");

        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
