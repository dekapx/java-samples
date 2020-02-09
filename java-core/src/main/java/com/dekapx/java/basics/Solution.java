package com.dekapx.java.basics;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] A1 = {2, 1, 3, 5, 4};    // 3
        int[] A2 = {2, 3, 4, 1, 5};      // 2
        int[] A3 = {1, 3, 4, 2, 5};     // 3
        System.out.println(solution(A2));
    }

    public static int solution(int[] A) {
        final List<Integer> list = new ArrayList<>();
        int turnOnCount = 0;
        for (int i = 0; i < A.length; i ++) {
            int current = A[i];
            list.add(current);

            if (!verify(list, current)) {
                turnOnCount ++;
            }
        }
        return turnOnCount;
    }



    private static boolean verify(List<Integer> list, int number) {
        boolean contains = true;
        for (int i = number; i > 0; i--) {
            if (!list.contains(number)) {
                contains = false;
            }
        }
        return contains;
    }
}
