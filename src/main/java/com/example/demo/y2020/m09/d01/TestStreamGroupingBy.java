package com.example.demo.y2020.m09.d01;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreamGroupingBy {
    public static void main(String[] args) {
        List<CreditPbcSummary> creditPbcSummaryList = new ArrayList<>();
        CreditPbcSummary creditPbcSummary1 = new CreditPbcSummary();
        creditPbcSummary1.setRoleTyp("01");
        creditPbcSummary1.setIntfSeq("1001");
        creditPbcSummary1.setCode("9999");
        creditPbcSummaryList.add(creditPbcSummary1);

        CreditPbcSummary creditPbcSummary2 = new CreditPbcSummary();
        creditPbcSummary2.setRoleTyp("05");
        creditPbcSummary2.setIntfSeq("1002");
        creditPbcSummary2.setCode("9999");
        creditPbcSummaryList.add(creditPbcSummary2);

        CreditPbcSummary creditPbcSummary3 = new CreditPbcSummary();
        creditPbcSummary3.setRoleTyp("01");
        creditPbcSummary3.setIntfSeq("1003");
        creditPbcSummary3.setCode("9016");
        creditPbcSummaryList.add(creditPbcSummary3);

        CreditPbcSummary creditPbcSummary4 = new CreditPbcSummary();
        creditPbcSummary4.setRoleTyp("05");
        creditPbcSummary4.setIntfSeq("1004");
        creditPbcSummary4.setCode("0000");
        creditPbcSummaryList.add(creditPbcSummary4);

        CreditPbcSummary creditPbcSummary5 = new CreditPbcSummary();
        creditPbcSummary5.setRoleTyp("02");
        creditPbcSummary5.setIntfSeq("1005");
        creditPbcSummary5.setCode("0000");
        creditPbcSummaryList.add(creditPbcSummary5);

        CreditPbcSummary creditPbcSummary6 = new CreditPbcSummary();
        creditPbcSummary6.setRoleTyp("01");
        creditPbcSummary6.setIntfSeq("1003");
        creditPbcSummary6.setCode("9016");
        creditPbcSummaryList.add(creditPbcSummary6);

        CreditPbcSummary creditPbcSummary7 = new CreditPbcSummary();
        creditPbcSummary7.setRoleTyp("05");
        creditPbcSummary7.setIntfSeq("1004");
        creditPbcSummary7.setCode("0000");
        creditPbcSummaryList.add(creditPbcSummary7);

        System.out.println("creditPbcSummaryList = " + creditPbcSummaryList);

        List<CreditPbcSummary> filterCollect = creditPbcSummaryList.stream().filter(
                summary -> "01,05".contains(summary.getRoleTyp())
        ).collect(Collectors.toList());

        System.out.println("filterCollect = " + filterCollect);

        List<CreditPbcSummary> filterCollect0105Success = filterCollect.stream().filter(
                summary -> "01".equals(summary.getRoleTyp()) && ("0000".equals(summary.getCode()) || "9016".equals(summary.getCode())) ||
                        "05".equals(summary.getRoleTyp()) && ("0000".equals(summary.getCode()) || "9016".equals(summary.getCode()))
        ).collect(Collectors.toList());

        System.out.println("filterCollect0105Success = " + filterCollect0105Success);

        Map<String, Long> collect = filterCollect.stream().filter(
                summary -> "0000,9016".contains(summary.getCode()) //||
//                        "9016".equals(summary.getCode())
        ).collect(Collectors.groupingBy(CreditPbcSummary::getCode, Collectors.counting()));

        System.out.println("collect = " + collect);

        Set<CreditPbcSummary> set = creditPbcSummaryList.stream()
                .filter(summary -> "01,05".contains(summary.getRoleTyp()))
                .filter(summary -> "0000".equals(summary.getCode()) || "9016".equals(summary.getCode()))
                .collect(Collectors.toSet());

        System.out.println("set = " + set);

        Map<String, String> map = creditPbcSummaryList.stream()
                .filter(summary -> "01,05".contains(summary.getRoleTyp()))
                .filter(summary -> "0000".equals(summary.getCode()) || "9016".equals(summary.getCode()))
                .distinct()
                .collect(Collectors.toMap(CreditPbcSummary::getRoleTyp, CreditPbcSummary::getIntfSeq));

        System.out.println("map = " + map);

        List<String> list = creditPbcSummaryList.stream()
                .filter(summary -> "01,05".contains(summary.getRoleTyp()))
                .filter(summary -> "0000".equals(summary.getCode()) || "9016".equals(summary.getCode()))
                .map(CreditPbcSummary::getIntfSeq)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("list = " + list);

        List<CreditPbcSummary> creditPbcSummaryList1 = new ArrayList<>();
        CreditPbcSummary creditPbcSummary11 = new CreditPbcSummary();
        creditPbcSummary11.setId(397209);
        creditPbcSummary11.setRoleTyp("01");
        creditPbcSummary11.setIntfSeq("30877363");
        creditPbcSummary11.setCode("0000");
        creditPbcSummary11.setActiveFlag("A");
        creditPbcSummary11.setCloneFlag("Y");
        creditPbcSummary11.setQueryDt("2020-09-29 08:20:09");
        creditPbcSummaryList1.add(creditPbcSummary11);

        CreditPbcSummary creditPbcSummary12 = new CreditPbcSummary();
        creditPbcSummary12.setId(397175);
        creditPbcSummary12.setRoleTyp("01");
        creditPbcSummary12.setIntfSeq("30877363");
        creditPbcSummary12.setCode("0000");
        creditPbcSummary12.setActiveFlag("A");
        creditPbcSummary12.setCloneFlag("Y");
        creditPbcSummary12.setQueryDt("2020-09-28 19:03:47");
        creditPbcSummaryList1.add(creditPbcSummary12);

        CreditPbcSummary creditPbcSummary13 = new CreditPbcSummary();
        creditPbcSummary13.setId(397089);
        creditPbcSummary13.setRoleTyp("01");
        creditPbcSummary13.setIntfSeq("30877363");
        creditPbcSummary13.setCode("0000");
        creditPbcSummary13.setActiveFlag("A");
        creditPbcSummary13.setCloneFlag("N");
        creditPbcSummary13.setQueryDt("2020-09-28 17:56:12");
        creditPbcSummaryList1.add(creditPbcSummary13);

        List<CreditPbcSummary> testSorted = creditPbcSummaryList1.stream().filter(summary -> "0000".equals(summary.getCode()))
                .sorted(Comparator.comparingInt(CreditPbcSummary::getId).reversed())
                .limit(1)
                .collect(Collectors.toList());
        System.out.println("testSorted = " + testSorted);
    }
}

@Data
class CreditPbcSummary {
    private Integer id;
    private String roleTyp;
    private String intfSeq;
    private String code;
    private String activeFlag;
    private String cloneFlag;
    private String queryDt;
}
