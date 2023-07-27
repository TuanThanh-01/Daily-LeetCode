package com.ptit;

public class LeetCode387 {

    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int count[] = new int[125];
        for (char c : arr) {
            count[c]++;
        }
        for (int i = 0;i< arr.length;i++) {
            if(count[arr[i]] == 1) {
                return i;
            }
        }
        return -1;
    }
}
