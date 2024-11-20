package com.yjh.schedulejpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Schedule extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String writerName;

    public Schedule(String writerName, String title, String description) {
        this.writerName = writerName;
        this.title = title;
        this.description = description;
    }

    public Schedule(){
    }

    public void update(String title,String description){
        this.description = description;
        this.title = title;
    }

}
