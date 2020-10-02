package io;

import java.util.Scanner;

//2439
public class Main20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int x = 1; x <= num; x++) {
            for(int y=1; y<=num-x; y++){
                System.out.print(" ");
            }

            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}