package com.maj.structural.bridge;

import com.maj.structural.bridge.devices.Device;
import com.maj.structural.bridge.devices.Tv;
import com.maj.structural.bridge.remotes.AdvancedRemote;
import com.maj.structural.bridge.remotes.BasicRemote;
import com.maj.structural.bridge.remotes.Remote;

public class Main {
    /**
     * Démonstration du pattern Bridge.
     *
     * Pour ajouter la fonctionnalité "Mute", il a suffit d'hériter de notre
     * télécommande de base, sans toucher à cette dernière, ni à la hiérarchie des devices que l'on souhaite manipuler.
     */
    public static void main(String[] args) {
        Device device = new Tv();
        Remote remote = new BasicRemote(device);
        AdvancedRemote advancedRemote = new AdvancedRemote(device);

        System.out.printf("Device volume : %d%n", device.getVolume());
        remote.volumeUp();
        remote.volumeUp();
        System.out.printf("Device volume : %d%n", device.getVolume());
        advancedRemote.mute();
        System.out.printf("Device volume : %d%n", device.getVolume());
    }
}
