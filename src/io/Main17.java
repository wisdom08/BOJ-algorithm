package io;

import java.util.Scanner;

//8393
public class Main17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum+=i;
        }
        System.out.println(sum);

    }
}