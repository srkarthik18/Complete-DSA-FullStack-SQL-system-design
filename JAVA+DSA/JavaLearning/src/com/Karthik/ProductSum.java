package com.Karthik;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int product = 1;
        int sum = 0;
        int answer = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            product = product * rem;

            sum = sum + rem;
        }
            answer = product - sum;
        System.out.println(answer);
    }
}
