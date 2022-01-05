package com.donggi.gist;

import java.util.Scanner;

public class b1052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int count;
        int result = 0;

        while (true) {
            count = 0;
            int copyN = N;
            while (copyN != 0) {

                if (copyN % 2 == 1) {
                    count++;
                }
                copyN /= 2;
            }
            if (count <= K) {
                break;
            }
            N++;
            result++;
        }
        System.out.println(result);
    }
}
