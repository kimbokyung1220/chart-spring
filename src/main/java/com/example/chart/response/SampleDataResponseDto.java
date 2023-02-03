package com.example.chart.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SampleDataResponseDto {
    private Long id;
    private String basicDate;
    private int impCnt;
    private int clickCnt;
    private double convCnt;
    private int sellCost;
    private int sellCnt;
    private int adSpend;
}
