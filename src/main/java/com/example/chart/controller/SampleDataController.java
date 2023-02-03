package com.example.chart.controller;

import com.example.chart.request.SampleDataRequestDto;
import com.example.chart.response.ResponseDto;
import com.example.chart.service.SampleDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class SampleDataController {

    final private SampleDataService sampleDataService;

    @PostMapping(value = "/test")
    public String date(@RequestBody SampleDataRequestDto requestDto) {
        return sampleDataService.test(requestDto);
}

// react화면에 보여질 차트, 그리드 데이터
    @GetMapping(value = "/sample")
    public ResponseEntity<Object> getSampleData() {
        return sampleDataService.getSampleData();
    }
}
