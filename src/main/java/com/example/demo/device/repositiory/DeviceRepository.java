package com.example.demo.device.repositiory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.device.domain.entity.DeviceEntity;

@Repository
public interface DeviceRepository extends JpaRepository<DeviceEntity, Long>  {
  List<DeviceEntity> findAllByDeviceName(String deviceName);  
}
