package com.maj.structural.bridge.remotes;

import com.maj.structural.bridge.devices.Device;

/**
 * Implémentation d'une télécommande de base qui sert de pont vers un device wrappé.
 */
public class BasicRemote implements Remote {
    protected final Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }

    @Override
    public void volumeUp() {
        this.device.setVolume(this.device.getVolume() + 5);
    }

    @Override
    public void volumeDown() {
        this.device.setVolume(this.device.getVolume() - 5);
    }

    @Override
    public void channelUp() {
        this.device.setChannel(this.device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        this.device.setChannel(this.device.getChannel() - 1);
    }
}
