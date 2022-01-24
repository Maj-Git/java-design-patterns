package com.maj.structural.bridge;

import com.maj.structural.bridge.devices.Device;
import com.maj.structural.bridge.devices.Tv;
import com.maj.structural.bridge.remotes.AdvancedRemote;
import com.maj.structural.bridge.remotes.BasicRemote;
import com.maj.structural.bridge.remotes.Remote;

public class Main {
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
