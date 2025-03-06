package com.Karthik;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        System.out.println(Arrays.toString(arr));
        int answer = linearSearchArr(arr,target);
        System.out.println(answer);
    }

    static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if (result == target) {
                    return new int[]{i, j};
                }
            }
        return new int[]{};
    }

    static int linearSearchArr(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
