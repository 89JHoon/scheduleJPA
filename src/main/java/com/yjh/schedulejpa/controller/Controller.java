package com.yjh.schedulejpa.controller;


import com.yjh.schedulejpa.dto.RequestDto;
import com.yjh.schedulejpa.dto.ResponseDto;
import com.yjh.schedulejpa.dto.UpdateRequestDto;
import com.yjh.schedulejpa.service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.PathMatcher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class Controller {

    private  final Service service;
    private final PathMatcher mvcPathMatcher;

    //전체 조회
    @GetMapping("/schedules")
    public ResponseEntity<List<ResponseDto>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/schedules/{id}")
    public ResponseEntity<ResponseDto> findOne(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }


    @DeleteMapping("/schedules/{id}")
    public ResponseEntity<String> deleteSchedule(@PathVariable Long id){
        service.deleteSchedule(id);
        return ResponseEntity.ok().body("정상적으로 삭제되었습니다.");
    }

    @PostMapping("/schedules")
    public ResponseEntity<ResponseDto> createSchedule(@RequestBody RequestDto requestDto ){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createSchedule(requestDto));
    }

    @PatchMapping("/schedules/{id}")
    public ResponseEntity<ResponseDto>updateSchedule(@RequestBody UpdateRequestDto updateRequestDto,
                                                     @PathVariable Long id){
        return ResponseEntity.ok().body(service.updateSchedule(id,updateRequestDto));
    }


}
