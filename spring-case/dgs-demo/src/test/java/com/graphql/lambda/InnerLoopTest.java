package com.graphql.lambda;

import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class InnerLoopTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        hiorder(list, System.out::println);
    }

    public static <T> void hiorder(List<T> list, Consumer<T> consumer) {
        ListIterator<T> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            T previous = iterator.previous();
            consumer.accept(previous);
        }
    }

}
