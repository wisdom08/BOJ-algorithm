package io;

import java.util.Scanner;

//2446
public class Main26 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (n * 2 - 1) - (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < (n-1) -i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <3+(2*i); j++) {
                System.out.print("*");
            }

            System.out.println();

        }



    }
}