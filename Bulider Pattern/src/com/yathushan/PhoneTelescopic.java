package com.yathushan;

public class PhoneTelescopic {
    String os;
    Double screenSize;
    String battery;
    String camera;

    public PhoneTelescopic(String os) {
        this.os = os;
    }

    public PhoneTelescopic(String os, Double screenSize) {
        this(os);
        this.screenSize = screenSize;
    }

    public PhoneTelescopic(String os, Double screenSize, String battery) {
        this(os,screenSize);
        this.battery = battery;
    }

    public PhoneTelescopic(String os, Double screenSize, String battery, String camera) {
        this(os,screenSize,battery);
        this.camera = camera;
    }


    @Override
    public String toString() {
        return "PhoneTelescopic{" +
                "os='" + os + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }
}
