package org.example.design_patterns.structural.bridge.remotes;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.design_patterns.structural.bridge.devices.IDevice;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 19, 2023
 * @see <a href="https://refactoring.guru/design-patterns/bridge">https://refactoring.guru/design-patterns/bridge</a>
 * @since 17
 */
@NoArgsConstructor
@AllArgsConstructor
public class BasicRemote implements IRemote {

    protected IDevice device;

    @Override
    public void power() {
        System.out.println("Remote: power toggle");

        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");

        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");

        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");

        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");

        device.setChannel(device.getChannel() + 1);
    }
}