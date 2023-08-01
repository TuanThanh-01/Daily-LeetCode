package com.ptit;

public class LeetCode1281 {

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int tmp = n % 10;
            product *= tmp;
            sum += tmp;
            n /= 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
