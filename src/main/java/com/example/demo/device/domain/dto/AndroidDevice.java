package com.example.demo.device.domain.dto;

import com.example.demo.device.domain.entity.Device;

public class AndroidDevice extends DeviceDto {

  private String deviceName;
  public AndroidDevice(Device device) {
    this.deviceName = device.getDeviceName();
  }

  @Override
  public String run(){
    return deviceName+" is android";
  }  
}
