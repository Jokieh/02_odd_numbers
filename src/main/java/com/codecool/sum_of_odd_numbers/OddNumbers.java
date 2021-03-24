package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {

        var ref = new Object() {
            Integer sum = 0;
        };

        numbers.stream()
                .filter(number -> number%2==1 || number%2==-1)
                .forEach(number -> ref.sum += number);

        return ref.sum;
    }
}