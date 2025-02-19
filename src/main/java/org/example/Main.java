package org.example;

import org.example.tasks.First;
import org.example.tasks.Second;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 6, 2, 3, 5, 4, 7 };
        System.out.println(First.maxPairwiseProduct(numbers));

        System.out.println(Second.firstUniqueChar("leetcode"));
    }
}