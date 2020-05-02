package com.dekapx.java.code.algorithms;

/**
 * A non-empty array A consisting of N integers is given.
 * The array contains an odd number of elements,
 * and each element of the array can be paired with another element that has the same value,
 * except for one element that is left unpaired.
 * <p>
 * For example, in array A such that:
 * A[0] = 9  A[1] = 3  A[2] = 9  A[3] = 3  A[4] = 9  A[5] = 7  A[6] = 9
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        OddOccurrencesInArray testOddOccurrencesInArray = new OddOccurrencesInArray();
        int result = testOddOccurrencesInArray.solution(A);
        System.out.println(result);
    }

    public int solution(int[] A) {
        int odd = 0;

        for (int i = 0; i < A.length; i ++) {
            if (i + 2 < A.length) {
                if (A[i] != A[i + 2]) {
                    odd = A[i + 2];
                }
            }
        }
        return odd;
    }
}
