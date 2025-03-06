package com.Karthik;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = palindrome(num);
        System.out.println(result);
    }
    static int palindrome(int num){
        int originalNumber = num;
        int answer = 0;

        while (num > 0){
            int rem = num % 10;
            num = num/10;
            answer = (answer * 10) + rem;
        }
        if(originalNumber == answer){
            return originalNumber;
        }
        return -1;
    }
}
