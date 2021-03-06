package com.zz;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//https://blog.csdn.net/qq_33609401/article/details/84862721?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-6.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-6.control

/**
 * @author zhangzhen
 * @date 2021/2/2 11:38
 **/
public class ListToMap {
    public static void main(String[] args) {

        List<Apple> appleList = new ArrayList<>();
        Apple apple1 = new Apple(1, "苹果1", new BigDecimal("3.25"), 10);
        Apple apple12 = new Apple(2, "苹果2", new BigDecimal("1.35"), 20);


        //Apple apple123 = new Apple(1, "苹果3", new BigDecimal("4.35"), 30);

        // Apple apple2 = new Apple(2, "香蕉", new BigDecimal("2.89"), 30);
        //
        // Apple apple3 = new Apple(3, "荔枝", new BigDecimal("9.99"), 40);
        appleList.add(apple1);
        appleList.add(apple12);
        //appleList.add(apple123);
        // appleList.add(apple2);
        // appleList.add(apple3);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(20);
        integers.add(10);

        for (int i1 = 0; i1 < integers.size(); i1++) {
            for (int i = 0; i < appleList.size(); i++) {
                if (integers.get(i1).equals(appleList.get(i).getNum())) {
                    integers.set(i1, appleList.get(i).getId());
                }
            }

        }


        System.out.println(integers);

        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                System.out.println("8");
            }
        }
         Map<Integer, List<Apple>> groupBy = appleList.stream().collect(Collectors.groupingBy(Apple::getId));
        // System.out.println(groupBy);

         groupBy.forEach((k,v) ->  {System.out.println(k);v.forEach(apple -> System.out.println(apple.toString()) ); }    );

/*
        groupBy.forEach((k,v) -> v.forEach(
                System.out::println));*/
      /*  Map<Integer, Apple> appleMap = appleList.stream().collect(Collectors.toMap(Apple::getId, a -> a,(k1,k2)->k2));
        System.out.println(appleMap);

        List<Apple> filterList = appleList.stream().filter(a -> a.getName().equals("香蕉")).collect(Collectors.toList());
        System.err.println("filterList:"+filterList);

        BigDecimal totalMoney = appleList.stream().map(Apple::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.err.println("totalMoney:"+totalMoney);  //totalMoney:17.48*/

        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.
                flatMap((childList) -> childList.stream());

    }


}
