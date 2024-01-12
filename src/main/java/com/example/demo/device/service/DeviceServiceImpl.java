package com.example.demo.device.service;

import org.springframework.stereotype.Service;

import com.example.demo.device.domain.dto.DeviceDto;
import com.example.demo.device.domain.dto.DeviceMaker;
import com.example.demo.device.domain.entity.Device;
import com.example.demo.device.repositiory.DeviceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {
  private final DeviceRepository deviceRepository;

  @Override
  public String run(Long userId, Long deviceId) {
    Device device = deviceRepository.findById(deviceId).get();
    DeviceDto deviceDto = DeviceMaker.make(device);

    String result = deviceDto.run();
    deviceRepository.save(device);

    return result;
  }

}
