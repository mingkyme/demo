package com.example.demo.device.domain.device;

public abstract class Device {
  protected long deviceId;
  protected String deviceName;
  public abstract String run();
}
