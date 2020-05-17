package com.yathushan;

public class PhoneTelescopic2 {
    String os;
    Double screenSize;
    String battery;
    String camera;

    public PhoneTelescopic2(String os, Double screenSize, String battery, String camera) {
        this.os = os;
        this.screenSize = screenSize;
        this.battery = battery;
        this.camera = camera;
    }

    public PhoneTelescopic2(String os, Double screenSize, String battery) {
        this(os,screenSize,battery,null);
    }

    public PhoneTelescopic2(String os, Double screenSize) {
        this(os,screenSize,null);
    }

    public PhoneTelescopic2(String os) {
        this(os,null);
    }

    @Override
    public String toString() {
        return "phoneTelescopic2{" +
                "os='" + os + '\'' +
                ", screenSize=" + screenSize +
                ", battery='" + battery + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }
}
