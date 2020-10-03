package io;

import java.util.Scanner;

//10992
public class Main28 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String leftChar = " ";
        String starChar = "*";


        for (int row = 0; row < n; row++) {

            //왼쪽
            int leftCnt = n-1-row;
            printChar(leftChar, leftCnt);

            //오른쪽
            int starCnt = row*2+1;

            //맨 윗줄 1개
            if(row == 0){
                printChar(starChar, 1);
            } else if(row == n-1){
            //맨 아랫 줄 전부 출력
            printChar(starChar, starCnt);
            } else {
                //양 끝 1개 씩 만 출력
                printChar(starChar, 1);
                printChar(leftChar, starCnt-2);
                printChar(starChar, 1);
            }
            System.out.println();
        }
    }

    private static void printChar(String ch, int cnt) {
        for (int col = 0; col < cnt; col++) {
            System.out.print(ch);
        }
    }
}