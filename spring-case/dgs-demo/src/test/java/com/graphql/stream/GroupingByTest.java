package com.graphql.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*静态导入*/
import static java.util.stream.Collectors.groupingBy;

public class GroupingByTest {
    public static void main(String[] args) {
        Stream<Hero> stream = List.of(
                new Hero("Batman", 10),
                new Hero("Superman", 20),
                new Hero("Wonder Woman", 30),
                new Hero("Aquaman", 40),
                new Hero("Flash", 50),
                new Hero("Green Lantern", 60),
                new Hero("Cyborg", 40)
        ).stream();

        /*1.mapping(x->y,dc)
         * */
//        Map<Integer, List<String>> listMap = stream.collect(
//                groupingBy(Hero::strength,
//                        Collectors.mapping(Hero::name, Collectors.toList())));
//        System.out.println(listMap);

        /* 2.filtering*/
        // Map<Integer, List<Hero>> collect = stream.collect(groupingBy(Hero::strength, Collectors.filtering(hero -> hero.strength > 40, Collectors.toList())));
//        Map<Integer, List<Hero>> collect = stream.filter(hero -> hero.strength > 40).collect(groupingBy(Hero::strength, Collectors.toList()));
//        for (Map.Entry<Integer, List<Hero>> entry : collect.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

        /*3. flatmapping*/
        // "Batman".chars().forEach(c -> System.out.println(c));
        // "Batman".chars().mapToObj(c -> Character.toString(c)).forEach(System.out::println);
        // stream.flatMap(hero -> hero.name.chars().mapToObj(Character::toString)).forEach(System.out::println);
//        Map<Integer, List<String>> listMap = stream.collect(groupingBy(Hero::strength, Collectors.flatMapping(hero -> hero.name.chars().mapToObj(Character::toString), Collectors.toList())));
//        System.out.println(listMap);

        /*4. counting*/
//        Map<Integer, Long> collect = stream.collect(groupingBy(Hero::strength, Collectors.counting()));
//        for (Map.Entry<Integer, Long> entry : collect.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

        /*5. minBy((a,b)->int)*/
//        Map<Integer, Optional<Hero>> collect = stream.collect(groupingBy(Hero::strength, Collectors.minBy(Comparator.comparingInt(h -> h.name().length()))));
//        collect.forEach((k, v) -> System.out.println(k + ":" + v.get()));

        /*6. maxBy((a,b)->int)*/
//        Map<Integer, Optional<Hero>> collect1 = stream.collect(groupingBy(Hero::strength, Collectors.maxBy(Comparator.comparingInt(h -> h.name().length()))));
//        collect1.forEach((k, v) -> System.out.println(k + ":" + v.get()));

        /*7. summingInt(x->int)
        * 8. averagingDouble(x->double)*/
        Map<Integer, Integer> collect = stream.collect(groupingBy(Hero::strength, Collectors.summingInt(Hero::strength)));
        collect.forEach((k, v) -> System.out.println(k + ":" + v));

        /*9. reducing(init,(p,x)->r);*/
//        Map<Integer, Integer> collect = stream.collect(groupingBy(Hero::strength, Collectors.reducing(0, Hero::strength, Integer::sum)));
//        collect.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    record Hero(String name, int strength) {
    }
}
