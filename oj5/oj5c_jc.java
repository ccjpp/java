package oj5;

import java.util.Scanner;

public class oj5c_jc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int in = scn.nextInt();
        int jc;
        if (in <= 12) {
            int num = 1;
            for (int i = 2; i <= in; i++) {
                num = num * i;
            }
            System.out.println(num);
        }
    }
}
