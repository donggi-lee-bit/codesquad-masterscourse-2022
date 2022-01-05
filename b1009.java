package com.donggi.gist;

import java.util.Scanner;

public class b1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = 1;

            for (int j = 0; j < b; j++) {
                res = a * res % 10;
                if (res == 0) {
                    res = 10;
                }
            }
            System.out.println(res);
        }
    }
}

