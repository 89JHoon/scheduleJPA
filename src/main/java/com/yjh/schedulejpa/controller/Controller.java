package com.yjh.schedulejpa.controller;


import com.yjh.schedulejpa.dto.ResponseDto;
import com.yjh.schedulejpa.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Controller {

    @GetMapping("/schedules")
    public ResponseEntity<List<ResponseDto>> findAll(){
        return ResponseEntity.ok().body(Service.findAll());;
    }
}
