package com.graphql.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream.of(
                        new Student("张三", 18),
                        new Student("李四", 19),
                        new Student("王五", 20)
                ).filter(student -> student.age > 18)
                .map(student -> student.name)
                .forEach(System.out::println);
        System.out.println("----------------");
        // flatMap
        Stream.of(List.of(
                                new Student("赵六", 21),
                                new Student("钱七", 22)
                        ), List.of(
                                new Student("孙八", 23),
                                new Student("李九", 24))
                ).flatMap(students -> students.stream())
                .forEach(System.out::println);
        System.out.println("----------------");
        Integer[][] arr20 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // flatMap
        Arrays.stream(arr20)
                .flatMap(array -> Arrays.stream(array))
                .forEach(System.out::println);
        System.out.println("----------------");
        Set.of(1, 2, 3).stream().forEach(System.out::println);
        System.out.println("----------------");
        Map.of("a", 1, "b", 2).entrySet().stream().forEach(System.out::println);
    }

    record Student(String name, int age) {
    }
}
