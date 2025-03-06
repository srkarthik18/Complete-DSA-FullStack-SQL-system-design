package com.Karthik;

import java.util.Arrays;

import static com.Karthik.Sorting.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
    }
}
