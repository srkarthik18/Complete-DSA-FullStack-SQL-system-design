package com.Karthik.LeetCodeQ;

import java.util.Arrays;

class LCQ75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0  ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}