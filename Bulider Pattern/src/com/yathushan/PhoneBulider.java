package com.yathushan;

import java.security.KeyStore;

public class PhoneBulider {
    private final String os;
    private final Double screenSize;
    private final String battery;
    private final String camera;


    public PhoneBulider(Builder builder){
        this.os=builder.os;
        this.screenSize=builder.screenSize;
        this.battery=builder.battery;
        this.camera=builder.camera;

    }

    static class Builder{
        private  String os;
        private Double screenSize;
        private String battery;
        private String camera;

        public PhoneBulider build(){
            return new PhoneBulider(this);
        }

        public Builder(String os) {
            this.os= os;
        }

        public Builder screenSize(Double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Builder battery(String battery) {
            this.battery = battery;
            return this;
        }

        public Builder camers(String camera) {
            this.camera = camera;
            return this;
        }

    }

    @Override
    public String toString() {
        return "PhoneBulider{" +
                "os='" + os + '\'' +
                ", screenSize=" + screenSize +
                ", battery='" + battery + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }
}
