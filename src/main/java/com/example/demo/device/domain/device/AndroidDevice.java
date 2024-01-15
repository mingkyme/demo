package com.example.demo.device.domain.device;

public class AndroidDevice extends Device {
  public AndroidDevice(long deviceId, String deviceName) {
    this.deviceId = deviceId;
    this.deviceName = deviceName;
  }

  @Override
  public String run(){
    return deviceName+" is android";
  }  
}
