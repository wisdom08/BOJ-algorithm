package io;

import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startNum = sc.nextInt();

        for (int i = startNum; i > 0; i--) {
            System.out.println(i);
        }
        sc.close();

    }
}