package easy;

import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String text = sc.nextLine();
            System.out.println(text);
        }

        sc.close();

    }
}