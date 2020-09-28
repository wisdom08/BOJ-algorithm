package easy;

import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();

        for (int i = 0; i < testNum; i++) {
            String[] arr = sc.next().split(",");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
    }
}