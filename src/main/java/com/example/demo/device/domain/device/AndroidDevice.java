package com.example.demo.device.domain.device;

import com.example.demo.device.domain.entity.DeviceEntity;

public class AndroidDevice extends Device {
  public AndroidDevice(DeviceEntity device) {
    this.deviceName = device.getDeviceName();
  }

  @Override
  public String run(){
    return deviceName+" is android";
  }  
}
