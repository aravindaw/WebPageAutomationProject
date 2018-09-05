package com.viewQwest.app.enums;

public enum Hardware {
    NETGEAR_AC220("NETGEAR Orbi WiFi System (RBK40) AC220"),
    NETGEAR_XR500("NETGEAR Nighthawk Pro Gaming WiFi Router (XR500)"),
    NETGEAR_WAC505 ("NETGEAR Enterprise-Grade Insight Managed Smart Cloud WiFi (WAC505)");

    private String hardware;

    Hardware(String hardware) {
        this.hardware = hardware;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }
}
