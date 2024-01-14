package com.example.demo.device.domain.factory;

import com.example.demo.device.domain.device.AndroidDevice;
import com.example.demo.device.domain.device.Device;
import com.example.demo.device.domain.device.IosDevice;
import com.example.demo.device.domain.entity.DeviceEntity;

public class DeviceFactory {
  public static Device make(DeviceEntity device) {
    if(device.getDeviceType().equals("android")){
      return new AndroidDevice(device);
    } else if(device.getDeviceType().equals("ios")){
      return new IosDevice(device);
    } else {
      throw new RuntimeException("지원하지 않는 디바이스입니다.");
    }
  }
}
