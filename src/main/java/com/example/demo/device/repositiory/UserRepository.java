package com.example.demo.device.repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.device.domain.entity.Device;
import com.example.demo.device.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    List<Device> findAllByUserName(String userName);  
}
