package com.example.demo.device.repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.device.domain.entity.DeviceEntity;
import com.example.demo.device.domain.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    List<DeviceEntity> findAllByUserName(String userName);  
}
