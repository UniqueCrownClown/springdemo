package com.graphql;

import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.core.toolkit.support.BiIntFunction;
import com.baomidou.mybatisplus.extension.parser.JsqlParserFunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {
    public static void main(String[] args) {
        String str = "hello world";
        String result = str.replaceAll("\\s+", "");
        lanmbda1 lambda = (String str1) -> {
            System.out.println(str1);
        };
        lambda.test(result);
        Consumer<String> lambda2 = s -> System.out.println(s);
        lambda2.accept("jack");

        Consumer<String> lambda3 = System.out::println;
        lambda3.accept("mike");

        Predicate<String> lambda4 = s -> s.length() > 0;
        System.out.println(lambda4.test("hello"));

        Predicate<String> lambda5 = String::isEmpty;
        System.out.println(lambda5.test(""));

        Supplier<String> lambda6 = () -> "hello";
        System.out.println(lambda6.get());


        BiIntFunction<String, Person> lambda7 = Person::new;
        System.out.println("lambda7----" + lambda7.apply("jack", 18));

        Function<Integer, String> lambda8 = n -> n.toString();
        System.out.println(lambda8.apply(1));

        Function<Integer, String> lambda9 = String::valueOf;
        System.out.println(lambda9.apply(1));


    }

    @FunctionalInterface
    interface lanmbda1 {
        void test(String str);
    }

    record Person(String name, int age) {
        public void sayHello() {
            System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");
        }
    }
}
