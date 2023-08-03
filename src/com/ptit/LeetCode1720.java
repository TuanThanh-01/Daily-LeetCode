package com.ptit;

import java.util.Arrays;

public class LeetCode1720 {

    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;

        for(int i = 0;i < encoded.length;i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decode(new int[]{1, 2, 3}, 1)));
    }
}
