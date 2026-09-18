package com.graphql.stream;

import java.util.stream.Stream;

public class ConcatSplitTest {
    public static void main(String[] args) {
        // 1. 合并
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream<Integer> concat = Stream.concat(stream1, stream2);
        // concat.forEach(System.out::println);

        // 2. 截取 - 直接给出截取的位置
        // skip(long n) 跳过前n个元素，保留剩下的
        // limit(long n) 保留前n个元素.剩下不要
        // concat.skip(2).limit(2).forEach(System.out::println);

        // 3. 截取 - 根据条件确定截取位置
        // takeWhile(Predicate<? super T> predicate) 条件成立保留，一旦条件不成立，剩下的不要
        // dropWhile(Predicate<? super T> predicate) 条件成立舍弃，一旦条件不成立，剩下的保留
        // concat.skip(2).takeWhile(i -> i < 5).forEach(System.out::println);
        concat.skip(2).dropWhile(i -> i < 5).forEach(System.out::println);

    }
}
