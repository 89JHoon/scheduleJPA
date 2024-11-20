package com.yjh.schedulejpa.dto;

import lombok.Getter;

@Getter
public class UpdateRequestDto {

    private final String title;
    private  final String description;


    public  UpdateRequestDto(String title, String description){
        this.title = title;
        this.description = description;
    }

}
