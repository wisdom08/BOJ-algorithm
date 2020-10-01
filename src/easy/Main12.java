package easy;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int strLen = str.length();
        int startInx = 0;
        int endInx = 10;

        int pack = strLen/10;

        for (int i = 0; i < pack; i++) {
            String tenOfStr = str.substring(startInx, endInx);
            startInx += 10;
            endInx += 10;
            System.out.println(tenOfStr);
        }

        String otherStr = str.substring(10 * pack);
        System.out.println( otherStr);
    }
}