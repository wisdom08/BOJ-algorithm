package io;

import java.util.Scanner;

//2441
public class Main22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}