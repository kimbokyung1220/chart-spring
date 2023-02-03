package com.example.chart.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class SampleData {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @Column(nullable = false)
    private String basicDate;
    private int impCnt;
    private int clickCnt;
    private int convCnt;
    private int sellCost;
    private int adSpend;


}
