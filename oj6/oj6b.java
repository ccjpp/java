package oj6;

import java.util.Arrays;
import java.util.Scanner;

public class oj6b {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int num = scn.nextInt();
        Integer[] numbers = new Integer[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scn.nextInt();
        }
        Arrays.sort(numbers);
        for (int i=0;i<num;i++){
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
       System.out.print("\r\n");
    }
}
