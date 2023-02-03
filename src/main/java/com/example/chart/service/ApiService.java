package com.example.chart.service;

import com.example.chart.request.SampleDataRequestDto;
import com.example.chart.response.ResponseDto;
import com.example.chart.response.SampleDataResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ApiService {
    // 데이터 추가
    public ResponseDto<?> create(SampleDataRequestDto request) {

        List<SampleDataResponseDto> responseDtoList = dataMethod();

        // 전환율 계산
        double convCnt = (double) request.getClickCnt() / request.getImpCnt();

        responseDtoList.add(
                SampleDataResponseDto.builder()
                        .id(request.getId()) // pk
                        .basicDate(request.getBasicDate()) // 날짜
                        .impCnt(request.getImpCnt()) // 노출수
                        .clickCnt(request.getClickCnt()) // 클릭수
                        .convCnt(convCnt) // 전환율(= 클릭수/노출수)
                        .adSpend(request.getAdSpend()) // 광고비
                        .sellCost(request.getSellCost()) // 판매금액
                        .sellCnt(request.getSellCnt()) // 판매 수량
                        .build()
        );

        return ResponseDto.success(responseDtoList);
    }

    // 데이터 수정
    public ResponseDto<?> update(Long id, SampleDataRequestDto request) {

        List<SampleDataResponseDto> responseDtoList = dataMethod();
        // 전환율 계산
        double convCnt = (double) request.getClickCnt() / request.getImpCnt();
        Long index = id - 1;

        responseDtoList.set(index.intValue(),
                SampleDataResponseDto.builder()
                        .id(id) // pk
                        .basicDate(request.getBasicDate()) // 날짜
                        .impCnt(request.getImpCnt()) // 노출수
                        .clickCnt(request.getClickCnt()) // 클릭수
                        .convCnt(convCnt) // 전환율(= 클릭수/노출수)
                        .adSpend(request.getAdSpend()) // 광고비
                        .sellCost(request.getSellCost()) // 판매금액
                        .sellCnt(request.getSellCnt()) // 판매 수량
                        .build()
        );

        return ResponseDto.success(responseDtoList);
    }

    // 데이터 삭제
    public ResponseDto<?> delete(Long id) {
        
        List<SampleDataResponseDto> responseDtoList = dataMethod();
        Long index = id - 1;
        
        // 데이터 삭제
        responseDtoList.remove(index.intValue());

        return ResponseDto.success(responseDtoList);
    }


    // 데이터 생성 method
    public List<SampleDataResponseDto> dataMethod() {
        // 차트, 그리드 랜덤값
        Random random = new Random();

        //데이터를 담을 List 선언
        List<SampleDataResponseDto> dataDtoList = new ArrayList<>();
        
        //데이터 5개 생성
        for (int i = 1; i < 5; i++) {
            int num = 20220100;
            int basicDate = 1;
            int index = +i;
            basicDate = num + i;
            dataDtoList.add(
                    SampleDataResponseDto.builder()
                            .id(Long.valueOf(index)) //pk값
                            .basicDate(String.valueOf(basicDate)) // 날짜
                            .impCnt(random.nextInt(10000)) // 노출수
                            .clickCnt(random.nextInt(1000)) // 클릭수
                            .convCnt(random.nextInt(1000))
                            .sellCost(random.nextInt(10000))
                            .adSpend(random.nextInt(10000))
                            .build()
            );
        }
        return dataDtoList;
    }
}
