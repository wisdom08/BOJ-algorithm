package io;

import java.util.Scanner;

//2522
public class Main25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            //공백
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            //별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=num-1; i>0; i--) {

            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}