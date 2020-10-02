package io;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        int [] arr =  new int[testNum];

        for(int i=0; i<testNum; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            arr[i] = num1 + num2;
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}