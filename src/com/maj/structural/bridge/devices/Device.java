package com.maj.structural.bridge.devices;

public interface Device {
    boolean isEnabled();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
    void enable();
    void disable();
}
