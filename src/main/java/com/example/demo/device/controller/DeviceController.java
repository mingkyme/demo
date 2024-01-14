package com.example.demo.device.controller;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.device.application.service.DeviceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DeviceController {
  private final DeviceService deviceService;
  // 1 유저가 device ID가 2인 device를 꺼내서, run 시키고 결과를 반환한다.
  // 1 유저는 실행시킨 시간이 업데이트 돼야함.
  // 12 Device는 상태가 업데이트 돼야함.
  @PostMapping("/users/{userId}/devices/{deviceId}/run")
	public String run(@PathVariable("userId") Long userId,@PathVariable("deviceId") Long deviceId) {
    return deviceService.run(userId, deviceId);
  }
}
