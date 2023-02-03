package com.example.chart.service;

import com.example.chart.request.SampleDataRequestDto;
import com.example.chart.response.ResponseDto;
import com.example.chart.response.SampleDataResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SampleDataService {
    public String test(SampleDataRequestDto requestDto) {
//        System.out.println(requestDto.getStartDate());
//        System.out.println(requestDto.getStartDate());
        return null;
    }

    // react화면에 그려질 차트, 그리드 값
    public ResponseEntity<Object> getSampleData() {
        // 차트, 그리드 랜덤값
        Random random = new Random();

        // 30일 데이터
        List<SampleDataResponseDto> dataDtoList = new ArrayList<>();
        Map<String, Object> rowDataList = new HashMap<>();

        for (int i = 1; i < 31; i++) {
            int num = 20220100;
            int basicDate = 1;
            basicDate = num + i;
            dataDtoList.add(
                    SampleDataResponseDto.builder()
                            .basicDate(String.valueOf(basicDate)) // 날짜
                            .impCnt(random.nextInt(10000)) // 노출수
                            .clickCnt(random.nextInt(1000)) // 클릭수
                            //.convCnt(random.nextInt(1000))
                            .sellCost(random.nextInt(10000))
                            .adSpend(random.nextInt(10000))
                            .build()
            );
        }
        rowDataList.put("rowData", dataDtoList);
//        System.out.println(rowDataList.toString());

        return ResponseEntity.ok().body(rowDataList);
    }
}


