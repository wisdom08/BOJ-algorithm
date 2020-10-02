package io;

import java.util.Scanner;

//1924
public class Main16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();
        int total = 0;

        int monthDay[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 1; i < m; i++) {
            total += monthDay[i];
        }

        total+=d;

        switch (total % 7){
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;

        }


    }
}