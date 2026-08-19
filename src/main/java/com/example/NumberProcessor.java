package com.example;

public class NumberProcessor {

    public static int sumEvenNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = sumEvenNumbers(n);

        System.out.println("Tong cac so chan tu 1 den " + n + " la: " + result);
    }
}
