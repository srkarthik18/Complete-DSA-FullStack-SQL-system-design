package com.Karthik;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
//        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
//        ReverseArray(arr);
//        System.out.println(Arrays.toString(arr));

    }
    static void ReverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
