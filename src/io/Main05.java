package io;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 == 0 && num2 == 0){
                    sc.close();
                    return;
            }

            System.out.println(num1+num2);
        }
    }
}