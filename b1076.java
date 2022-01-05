package com.donggi.gist;

import java.util.Scanner;

public class b1076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long res = 0;

        for (int i = 0; i < 3; i++) {
            String str = sc.next();

            for (int j = 0; j < color.length; j++) {

                if (i == 0 && str.equals(color[j])) {
                    int ten = j * 10;
                    res = ten;
                }

                if (i == 1 && str.equals(color[j])) {
                    int one = j;
                    res += one;
                }

                if (i == 2 && str.equals(color[j])) {
                    long multiply = (long) Math.pow(10, j);
                    res *= multiply;
                }
            }
        }
        System.out.println(res);
    }
}
