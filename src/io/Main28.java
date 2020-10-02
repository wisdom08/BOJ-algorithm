package io;

import java.util.Scanner;

//10992
public class Main28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();


        for(int i=0;i<n;i++) { // 별의 범위에서 양 끝에 속하는 열을 출력해야 하므로, 0부터 시작한다.
            // 예를들어 n이 4일 경우 첫 번째 행은 4번 열에만 별이 찍히고,
            // 두 번째 행은 4-1, 4+1 열에만 별이 찍히게 된다.
            for(int j=1;j<2*n;j++) { // 열의 범위는 별 찍기-16과 동일하다.
                if(j>n+i) break; // 마지막 별을 찍었으면 반복문을 벗어난다.
                if(i==n-1) { // 마지막 행에 도착하면 모든 열에 별을 찍는다.
                    System.out.print("*");
                    continue;
                }
                if(j==n-i || j==n+i) { // 범위의 양 끝에 별을 찍는다.
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();

        }

    }
}