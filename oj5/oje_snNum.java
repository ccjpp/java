package oj5;

import java.util.Scanner;

public class oje_snNum {
    static double evenNumber(int n){
        double num=0.0;
        for(int i=1;i<=n/2;i++){
            num=num+1.0/(i*2.0);
        }
        return num;
    }

    static double oddNumber(int n){
        double num=0;
        if(n==1){
            return 1;
        }
        for(double i=0;i<n/2.0;i++){
            num=num+1.0/(i*2.0+1);
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n%2==0){
            System.out.printf("%.2f",evenNumber(n));
        }else{
            System.out.printf("%.2f",oddNumber(n));
        }

    }
}
