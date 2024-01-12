package com.example.demo.device.domain.entity;

import java.sql.Time;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "device")
public class Device {
    @Id
    private Long id;
    private String deviceName;
    private String deviceType;
    private Time createdAt;
    private Time updatedAt;
}
