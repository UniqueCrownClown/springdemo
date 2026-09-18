package com.graphql.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * 收集: 将元素收集到容器里
 * collect(()->c,(c,x)->void,?)
 * ()->c 创建容器c
 * (c,x)->void 收集元素x到容器c
 */
public class CollectTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("天津饭", "短笛", "布玛", "贝吉塔", "卡卡罗特");
        /*收集到list*/
//        List collect = stream.collect(() -> new ArrayList<>(
//        ), (list, x) -> list.add(x), (c1, c2) -> {
//        });
        // ArrayList:: new  ()->new ArrayList()
        // ArrayList::add (c,x)->c.add(x)
        /*收集到set*/
//        Set<Object> collect = stream.collect(() -> new HashSet<>(), (set, hero) -> set.add(hero), (c1, c2) -> {
//        });
//        collect.stream().forEach(System.out::println);
        /*收集到map*/
//        Map<String, Integer> collect = stream.collect(() -> new HashMap<>(), (map, x) -> map.put(x, 1), (c1, c2) -> {
//        });
//
//        collect.forEach((k, v) -> System.out.println(k + ":" + v));

//        StringBuilder builder = stream.collect(StringBuilder::new, StringBuilder::append, (c1, c2) -> {
//        });
//        System.out.println(builder);

        StringJoiner collect = stream.collect(() -> new StringJoiner(","), StringJoiner::add, (c1, c2) -> {
        });
        System.out.println(collect);




    }

    record Hero(String name, int strength) {
    }
}
