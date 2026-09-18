package com.graphql.stream;


import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class EffectiveTest {
    public static void main(String[] args) {
        IntStream a = IntStream.of(97, 98, 99);
        LongStream b = LongStream.of(1L, 2L, 3L);
        DoubleStream c = DoubleStream.of(1.0, 2.0, 3.0);

        Stream<Integer> d = Stream.of(1, 2, 3);

        // a.mapToObj(Character::toString).forEach(System.out::println);

        IntSummaryStatistics intSummaryStatistics = a.summaryStatistics();
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMax());

        Stream<Hero> heroes = Stream.of(
                new Hero("Batman", 10),
                new Hero("Superman", 100));

        IntStream intStream = heroes.mapToInt(Hero::strength);
        intStream.forEach(System.out::println);


    }

    record Hero(String name, int strength) {
    }
}
