package com.Karthik;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int result = findMin(arr);
        System.out.println(result);
    }

    static int findMin(int[] arr){
        int answer = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < answer){      //(answer < arr[i]) will give the maximum number
                answer = arr[i];
            }
        }
        return answer;
    }
}
