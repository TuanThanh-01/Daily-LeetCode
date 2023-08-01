package com.ptit;

public class LeetCod1678 {

    public static String interpret(String command) {
        String result = "";
        for (int i = 0;i < command.length();) {
            if(command.charAt(i) == 'G') {
                result = result.concat("G");
                i += 1;
            }
            else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result = result.concat("o");
                i += 2;
            }
            else {
                result = result.concat("al");
                i += 4;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }
}
