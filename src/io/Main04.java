package io;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println(num1+num2);
        }
    }
}