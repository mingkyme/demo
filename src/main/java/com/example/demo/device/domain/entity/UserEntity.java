package com.example.demo.device.domain.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "user")
public class UserEntity {
  @Id
  private Long id;
  private String userName;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
