package com.dekapx.java.datastructures.search;

public class BinarySearch {
    public static void main(String[] args) {
        final int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};

        int key = 10;
        final int low = 0;
        final int high = elements.length - 1;

        System.out.println("Found: " + searchRecursive(elements, key, low, high));
        System.out.println("Found: " + searchIterative(elements, key, low, high));
    }

    public static boolean searchRecursive(int[] elements, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return false;
        }

        if (key == elements[middle]) {
            return true;
        } else if (key < elements[middle]) {
            return searchRecursive(elements, key, low, middle - 1);
        } else {
            return searchRecursive(elements, key, middle + 1, high);
        }
    }

    public static boolean searchIterative(int[] elements, int key, int low, int high) {
        boolean found = false;
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (elements[mid] < key) {
                low = mid + 1;
            } else if (elements[mid] > key) {
                high = mid - 1;
            } else if (elements[mid] == key) {
                found = true;
                break;
            }
        }
        return found;
    }

}
