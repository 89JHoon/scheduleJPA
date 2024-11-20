package com.yjh.schedulejpa.dto;

import lombok.Getter;

@Getter
public class RequestDto {
   private final String writerName;
   private final String title;
   private final String description;

   public RequestDto(String writerName, String title, String description){
      this.writerName = writerName;
      this.title = title;
      this.description =description;
   }
}
