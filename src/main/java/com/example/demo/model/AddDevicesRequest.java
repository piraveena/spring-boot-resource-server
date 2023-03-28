package com.example.demo.model;

import java.util.List;

public class AddDevicesRequest {

    private List<AddDeviceRequest> devices;

    AddDevicesRequest(List<AddDeviceRequest> devices) {
        this.devices = devices;
    }

    public List<AddDeviceRequest> getDevices() {
        return devices;
    }
}
