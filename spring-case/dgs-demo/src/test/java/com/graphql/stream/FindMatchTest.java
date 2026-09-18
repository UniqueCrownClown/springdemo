package com.graphql.stream;

import java.util.stream.IntStream;

public class FindMatchTest {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 1. findFirst && Optional的常见用法
        // System.out.println(intStream.filter(i -> i % 2 == 0).findFirst().orElse(-1));
        // intStream.filter(i -> i % 2 == 0).findFirst().ifPresent(System.out::println);

        // 2. findAny
        intStream.filter(i -> i % 2 == 0).findAny().ifPresent(System.out::println);

        // 3. anyMatch
        // System.out.println(intStream.anyMatch(i -> i % 2 == 0));
        // 4. allMatch
        // System.out.println(intStream.allMatch(i -> i % 2 == 0));
        // 5. noneMatch
        System.out.println(intStream.noneMatch(i -> i % 2 == 0));

    }
}
