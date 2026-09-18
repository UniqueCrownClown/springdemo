package com.graphql.lambda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClosureTest {
    public static void main(String[] args) throws IOException {
        // effetive final & final
        List<Runnable> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i + 1;
            Runnable task1 = () -> {
                System.out.println(Thread.currentThread() + "task" + finalI);
            };
            result.add(task1);
        }

        ExecutorService executor = Executors.newFixedThreadPool(5);
        result.forEach(executor::execute);
    }
}
