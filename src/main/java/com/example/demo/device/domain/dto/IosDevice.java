package com.example.demo.device.domain.dto;

import com.example.demo.device.domain.entity.Device;

public class IosDevice extends DeviceDto {
  private String deviceName;
  public IosDevice(Device device) {
    this.deviceName = device.getDeviceName();
  }

  @Override
  public String run(){
    return deviceName+" is ios";
  }  
}
