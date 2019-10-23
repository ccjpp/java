package oj6;

import java.util.Scanner;

public class oj6e {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int[] arr=new int[9];
        int num=0;
        for(int i=0;i<9;i++){
            arr[i]=scn.nextInt();
            num=num+arr[i];
        }
        double mean=num/9.0;
        System.out.print(num);
        System.out.print(" ");
        int accumulation=0;
        for(int i=0;i<9;i++) {
            if(arr[i]>mean){
                accumulation++;
            }
        }
        System.out.println(accumulation);
    }
}