package com.devex;

import java.util.List;

public class Util {

    public static boolean isSorted(List<Integer> list) {
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
