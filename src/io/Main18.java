package io;

import java.util.ArrayList;
import java.util.Scanner;

//10818
public class Main18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int arr[] = new int[input];
        for (int i = 1; i <= input; i++) {
            arr[i-1] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if(min>i){
                min = i;
            }

            if(max<i){
                max = i;
            }
        }

        System.out.print(min+" "+max);

    }
}