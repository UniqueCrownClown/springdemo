package com.graphql.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Collector收集器*/
public class CollectorTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("天津饭", "短笛", "布玛", "贝吉塔", "卡卡罗特");
        /*1. 收集到list*/
/*        List collect = stream.collect(() -> new ArrayList<>(
        ), (list, x) -> list.add(x), (c1, c2) -> {
        });
         ArrayList:: new  ()->new ArrayList()
         ArrayList::add (c,x)->c.add(x)*/

//        List<String> stringList = stream.collect(Collectors.toList());
//        stringList.stream().forEach(System.out::println);

        /*2. 收集到set*/
/*        Set<Object> collect = stream.collect(() -> new HashSet<>(), (set, hero) -> set.add(hero), (c1, c2) -> {
        });
        collect.stream().forEach(System.out::println);*/

//        Set<String> stringSet = stream.collect(Collectors.toSet());
//        stringSet.stream().forEach(System.out::println);

        /*3. 收集到StringBuilder*/
//        StringBuilder builder = stream.collect(StringBuilder::new, StringBuilder::append, (c1, c2) -> {
//        });
//        System.out.println(builder);
        /*4. 收集到StringJoiner*/
//        StringJoiner collect = stream.collect(() -> new StringJoiner(","), StringJoiner::add, (c1, c2) -> {
//        });
//        System.out.println(collect);

//        String collect = stream.collect(Collectors.joining());
//        System.out.println(collect);
//
//        String collected = stream.collect(Collectors.joining(","));
//        System.out.println(collected);

        /*5. 收集到map*/
//        Map<String, Integer> collect = stream.collect(() -> new HashMap<>(), (map, x) -> map.put(x, 1), (c1, c2) -> {
//        });
//
//        collect.forEach((k, v) -> System.out.println(k + ":" + v));

//        Map<String, Integer> integerMap = stream.collect(Collectors.toMap(x -> x, y -> 1));
//        integerMap.entrySet().forEach(System.out::println);

        /**
         *Collectors.groupBy
        * 下游收集器
         * */
        Map<Object, List<String>> objectListMap = stream.collect(Collectors.groupingBy(x -> x.length(), Collectors.toList()));
        objectListMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    record Hero(String name, int strength) {
    }
}
