package com.yjh.schedulejpa.repository;

import com.yjh.schedulejpa.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Schedule, Long> {

}
