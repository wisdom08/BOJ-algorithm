package io;

import java.util.Scanner;

//2438
public class Main19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int cnt=0;
        for (int x = 1; x <= input; x++) {
            cnt++;
            for (int y = 1; y <= cnt; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}