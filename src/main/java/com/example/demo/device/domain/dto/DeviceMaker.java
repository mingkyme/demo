package com.example.demo.device.domain.dto;

import com.example.demo.device.domain.entity.Device;

public class DeviceMaker {
  public static DeviceDto make(Device device) {
    if(device.getDeviceType().equals("android")){
      return new AndroidDevice(device);
    } else if(device.getDeviceType().equals("ios")){
      return new IosDevice(device);
    } else {
      throw new RuntimeException("지원하지 않는 디바이스입니다.");
    }
  }
}
