package com.maj.structural.bridge.remotes;

import com.maj.structural.bridge.devices.Device;

/**
 * Implémentation d'une télécommande avancée qui permet également de couper le volume du device wrappé.
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
