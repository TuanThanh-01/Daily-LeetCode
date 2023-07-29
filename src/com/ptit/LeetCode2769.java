package com.ptit;

public class LeetCode2769 {

    // find max value => case num + t and result - t -> result - t = num + t
    // => result = num + 2t
    public static int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }

    public static void main(String[] args) {
        System.out.println(theMaximumAchievableX(4, 1));
    }
}
