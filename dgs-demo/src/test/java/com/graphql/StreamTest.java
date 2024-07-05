package com.graphql;

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

    }

    record Student(String name, int age) {
    }
}
