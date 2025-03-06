package com.Karthik;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println(isArmStrong(num));

        for (int i = 0; i< 1000; i++){
            if (isArmStrong(i)) System.out.println(i + " ");
        }
    }
        public static boolean isArmStrong(int num){
//            Scanner input = new Scanner(System.in);
//            int num = input.nextInt();
            int original = num;
            int sum = 0;

            while (num > 0){
                int rem = num % 10;
                int cube = (rem * rem * rem);
                num /= 10;
                sum = sum + cube;
            }
            return sum == original;
        }

}
