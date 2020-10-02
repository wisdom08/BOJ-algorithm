package io;

import java.util.Scanner;

//10991
public class Main27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            //공백
            for (int j = 1; j < num-i; j++) {
                System.out.print(" ");
            }
            //별
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }

            System.out.println();
        }


        sc.close();
    }
}