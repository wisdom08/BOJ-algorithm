package io;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();

        int[] arr = new int[testNum];
        int sum = 0;

        String input = sc.next();

        for (int i = 0; i < testNum; i++) {
            sum += input.charAt(i) -'0';
        }

        System.out.println(sum);


    }
}