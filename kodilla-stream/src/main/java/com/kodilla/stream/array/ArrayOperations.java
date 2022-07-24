package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static Double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println(numbers[i]));

        Double avg = IntStream.of(numbers)
                .average().orElse(0.0);
        return avg;
    }
}
