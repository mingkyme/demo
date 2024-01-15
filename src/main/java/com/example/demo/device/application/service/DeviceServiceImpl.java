package com.example.demo.device.application.service;

import org.springframework.stereotype.Service;

import com.example.demo.device.domain.device.Device;
import com.example.demo.device.domain.entity.DeviceEntity;
import com.example.demo.device.domain.factory.DeviceFactory;
import com.example.demo.device.repositiory.DeviceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {
  private final DeviceRepository deviceRepository;

  @Override
  public String run(Long userId, Long deviceId) {
    DeviceEntity device = deviceRepository.findById(deviceId).get();
    // Fatory를 위한 DTO 생성
    
    Device deviceDto = DeviceFactory.make(device);

    String result = deviceDto.run();
    deviceRepository.save(device);

    return result;
  }

}
