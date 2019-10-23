package oj5;

import java.util.*;

public class oj5b_jc {

    static long jc(int n){
        long num=1;
        for(int i=2;i<=n;i++){
            num=num*i;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        long num=0;
        for(int i=0;i<n;i++){
            int in=n-i;
            num=num+jc(in);
            if(in<0){
                break;
            }
        }
        if(num==0){
            System.out.println(1);
        }
        else
            System.out.println(num);
    }
}