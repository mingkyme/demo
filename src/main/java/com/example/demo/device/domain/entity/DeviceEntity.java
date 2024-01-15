package com.example.demo.device.domain.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "device")
public class DeviceEntity {
    @Id
    private Long id;
    private String deviceName;
    private String deviceType;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    

}
