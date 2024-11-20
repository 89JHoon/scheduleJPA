package com.yjh.schedulejpa.dto;

import com.yjh.schedulejpa.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ResponseDto {
    private final long id;
    private final String writerName;
    private final String title;
    private final String description;
    private final LocalDateTime createdAt;
    private final LocalDateTime mdifiedAt;

    public ResponseDto(Long id , String writerName,String title, String description , LocalDateTime createdAt, LocalDateTime mdifiedArt){
        this.id = id;
        this.writerName = writerName;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.mdifiedAt  = mdifiedArt;
    }

    public static ResponseDto toDto(Schedule schedule){
        return new ResponseDto(
                schedule.getId(),
                schedule.getWriterName(),
                schedule.getTitle(),
                schedule.getDescription(),

                schedule.getCreatedAt(),
                schedule.getModifiedAt()
        );
    }
}
