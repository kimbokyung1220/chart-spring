package com.example.chart.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SampleDataRequestDto {
    private Long id;
    private String basicDate;
    private int impCnt;
    private int clickCnt;
    private double convCnt;
    private int sellCost;
    private int sellCnt;
    private int adSpend;
}
