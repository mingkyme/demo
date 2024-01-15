package com.example.demo.device.domain.device;

public class IosDevice extends Device {
  public IosDevice(long deviceId, String deviceName) {
    this.deviceId = deviceId;
    this.deviceName = deviceName;
  }

  @Override
  public String run(){
    return deviceName+" is ios";
  }  
}
