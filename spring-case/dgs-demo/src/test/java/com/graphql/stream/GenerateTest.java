package com.graphql.stream;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class GenerateTest {
    public static void main(String[] args) {
        // 1. range
//        IntStream.range(1, 10).forEach(System.out::println);
//        IntStream.rangeClosed(1, 9).forEach(System.out::println);

        // 2. iterate 奇数序列
//         IntStream.iterate(1, i -> i + 2).limit(10).forEach(System.out::println);
//         IntStream.iterate(1, x -> x <= 9, x -> x + 2).forEach(System.out::println);
        // 3. generate
        // IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100)).limit(5).forEach(System.out::println);
        ThreadLocalRandom.current().ints(5).forEach(System.out::println);
    }
}
