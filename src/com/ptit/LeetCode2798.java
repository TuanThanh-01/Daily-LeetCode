package com.ptit;

public class LeetCode2798 {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int countEmployee = 0;
        for(int hour : hours) {
            if(hour >= target) {
                countEmployee++;
            }
        }
        return countEmployee;
    }
}
