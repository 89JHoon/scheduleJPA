package com.yjh.schedulejpa.service;


import com.yjh.schedulejpa.dto.RequestDto;
import com.yjh.schedulejpa.dto.ResponseDto;
import com.yjh.schedulejpa.dto.UpdateRequestDto;
import com.yjh.schedulejpa.entity.Schedule;
import com.yjh.schedulejpa.repository.Repository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    private final Repository repository;

    public List<ResponseDto> findAll() {
        List<Schedule> schedules = repository.findAll();

        return schedules
                .stream()
                .map(ResponseDto::toDto)
                .toList();
    }

    public ResponseDto findById(Long id) {
        return ResponseDto.toDto(findScheduleById(id));
    }

    private Schedule findScheduleById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("잘못된 ID 값입니다."));

    }

    public void deleteSchedule(Long id) {
        findScheduleById(id);
        repository.deleteById(id);
    }

    @Transactional
    public ResponseDto createSchedule(RequestDto requestDto) {
        Schedule schedule = new Schedule(requestDto.getWriterName(), requestDto.getTitle(), requestDto.getDescription());
        Schedule saveSchedule = repository.save(schedule);
        return ResponseDto.toDto(saveSchedule);
    }

    @Transactional
    public ResponseDto updateSchedule(long id, UpdateRequestDto updateRequestDto) {
        Schedule schedule = findScheduleById(id);
        schedule.update(updateRequestDto.getTitle(), updateRequestDto.getDescription());
        return ResponseDto.toDto(schedule);
    }


}
