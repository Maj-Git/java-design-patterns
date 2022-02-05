package com.maj.structural.bridge.devices;

/**
 * Interface pour un device.
 */
public interface Device {
    boolean isEnabled();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
    void enable();
    void disable();
}
