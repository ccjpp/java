package oj6;

import java.util.Scanner;

public class oj6d {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int[] arr=new int[10];
        int num=0;
        for(int i=0;i<10;i++){
            arr[i]=scn.nextInt();
            num=num+arr[i];
        }
        double mean=num/10.0;
        System.out.printf("%.1f",mean);
        System.out.println();
        for(int i=0;i<10;i++) {
            if(arr[i]>mean){
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
