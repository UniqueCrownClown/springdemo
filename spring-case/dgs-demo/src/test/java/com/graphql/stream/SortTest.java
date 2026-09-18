package com.graphql.stream;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortTest {
    public static void main(String[] args) {
        // 去重
        IntStream.of(1, 2, 3, 4, 5, 6, 2, 5).distinct().forEach(System.out::println);
        // 排序
        Stream.of(new Hero("天津饭", 3),
                        new Hero("短笛", 30),
                        new Hero("布玛", 2),
                        new Hero("贝吉塔", 200),
                        new Hero("卡卡罗特", 400))
                // .sorted((h1, h2) -> h1.strength() - h2.strength())
                .sorted(Comparator.comparingInt(Hero::strength).reversed().thenComparingInt(h -> h.name().length()))
                .forEach(System.out::println);
    }

    record Hero(String name, int strength) {
    }
}
