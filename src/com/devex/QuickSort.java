package com.devex;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public List<Integer> sort(List<Integer> list) {

        List<Integer> sortedList = list;

        while (!isSorted(sortedList)) {
            List<Integer> lowerList = new ArrayList<>();
            List<Integer> higherList = new ArrayList<>();

            int pivot = -1;
            int lastIndex = sortedList.size() - 1;
            for (int i = 0; i < lastIndex; i++) {

                pivot = sortedList.get(lastIndex);
                int number = sortedList.get(i);
                if (number < pivot) {
                    lowerList.add(number);
                } else {
                    higherList.add(number);
                }
            }

            sortedList = sort(lowerList);
            sortedList.add(pivot);
            sortedList.addAll(sort(higherList));

        }

        return sortedList;
    }

    private boolean isSorted(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                continue;
            }
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
