package com.example.chart.controller;

import com.example.chart.request.SampleDataRequestDto;
import com.example.chart.response.ResponseDto;
import com.example.chart.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class ApiController {
    final private ApiService apiService;

    // 데이터 생성
    @PostMapping(value = "/report")
    public ResponseDto<?> create(@RequestBody SampleDataRequestDto request) {
        return apiService.create(request);
    }

    // 데이터 수정
    @PutMapping(value = "/report/{id}")
    public ResponseDto<?> update(@PathVariable Long id, @RequestBody SampleDataRequestDto request) {
        return apiService.update(id, request);
    }

    // 데이터 삭제
    @DeleteMapping(value = "/report/{id}")
    public ResponseDto<?> delete(@PathVariable Long id) {
        return apiService.delete(id);
    }
}
