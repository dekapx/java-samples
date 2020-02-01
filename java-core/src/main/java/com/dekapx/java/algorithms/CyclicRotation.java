package com.dekapx.java.algorithms;

import java.util.Arrays;

/**
  An array A consisting of N integers is given.
  Rotation of the array means that each element is shifted right by one index,
  and the last element of the array is moved to the first place.
  For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
  (elements are shifted right by one index and 6 is moved to the first place).
  <p>
  A = [3, 8, 9, 7, 6]
  K = 3
  the function should return [9, 7, 6, 3, 8]. Three rotations were made:
  [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
  [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
  [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 */
public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] result = cyclicRotation.solution(A, K);
        print(result);
    }

    public int[] solution(int[] A, int K) {
        for (int i = 0; i < K; i ++) {
            int lastIndex = A.length - 1;

            int[] elements = new int[A.length];
            elements[0] = A[lastIndex];

            for (int j = 1; j < A.length; j ++) {
                int current = A[j - 1];
                elements[j] = current;
            }
            A = elements;
        }
        return A;
    }

    private static void print(int[] elements) {
        Arrays.stream(elements).forEach(i -> System.out.print(i + " "));
    }
}
