package com.Karthik;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int target = input.nextInt();
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscOrDes = arr[start] < arr[end];
        while(start < end){
            int mid = start + (end - start) / 2;
            //optimized way of finding middle element bcz if in case (start + end) exceeds the integer limit
            if(arr[mid] == target){
                return mid;
            }
            if(isAscOrDes){   // Order Agnostic Binary Search
                if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
