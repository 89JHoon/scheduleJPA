package com.yjh.schedulejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class ScheduleJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleJpaApplication.class, args);
    }

    // Lv.1 일정 CRUD
    //일정을 저장 조회 수정 삭제 기능
    // 작성 유저명 할일 제목, 할일 내용, 작성일 수정일
    //작성일 수정일  -> JAP Auditing 활용


}
