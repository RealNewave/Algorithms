package com.devex;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();

        List<Integer> list = generateRandomList(10_000_000);
        long start = System.currentTimeMillis();
        List<Integer> sortedList = quickSort.sort(list);
        long end = System.currentTimeMillis();
        float sec = (end - start) / 1000F;
        System.out.println(sec + " seconds");
        if (sortedList.get(0) > sortedList.get(sortedList.size() - 1) || sortedList.get(0) > sortedList.get(1))
            throw new RuntimeException(String.format("First index was %d and last index was %d", sortedList.get(0), sortedList.get(sortedList.size() - 1)));

    }

    private static List<Integer> generateRandomList(int amount) {

        Random random = new Random();
        return random.ints(amount).boxed().collect(Collectors.toList());
    }
}
