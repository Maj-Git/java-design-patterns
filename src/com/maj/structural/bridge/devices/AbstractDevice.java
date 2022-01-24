package com.maj.structural.bridge.devices;

public abstract class AbstractDevice implements Device {

    private boolean on;
    private int volume;
    private int channel;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = Math.min(volume, 100);
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }
}
