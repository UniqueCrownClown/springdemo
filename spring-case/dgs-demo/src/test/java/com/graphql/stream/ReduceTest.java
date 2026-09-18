package com.graphql.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 化简：两两合并，只剩一个
 * 适合：最大值最小值，求和，求个数
 * .reduce((p,x)->r)
 * .reduce(init,(p,x)->r);
 * .reduce(init,(p,x)->r,(r1,r2)->r)
 **/
public class ReduceTest {
    public static void main(String[] args) {
        Stream<Hero> heroStream = Stream.of(new Hero("天津饭", 3),
                new Hero("短笛", 30),
                new Hero("布玛", 2),
                new Hero("贝吉塔", 200),
                new Hero("卡卡罗特", 400));
// 武力值最高的hero
//        Optional<Hero> hero = heroStream.reduce((h1, h2) -> h1.strength() > h2.strength() ? h1 : h2);
//        hero.ifPresent(h -> System.out.println(h.name()));

//        Hero reduce = heroStream.reduce(new Hero("_" +
//                "", 0), (h1, h2) -> h1.strength() > h2.strength() ? h1 : h2);
//        System.out.println(reduce.name());

// 高手武力值总数

//        Optional<Integer> sum = heroStream.map(Hero::strength).reduce(Integer::sum);
//        sum.ifPresent(System.out::println);

        // System.out.println(heroStream.count());
        // System.out.println(heroStream.max(Comparator.comparingInt(Hero::strength)));
//        System.out.println(heroStream.mapToInt(Hero::strength).sum());
        heroStream.mapToInt(Hero::strength).average().ifPresent(System.out::println);
    }

    record Hero(String name, int strength) {
    }
}
