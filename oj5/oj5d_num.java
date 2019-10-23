package oj5;

import java.util.Scanner;

public class oj5d_num {
    static int sequen(int n){
        int num=0;
        int num1=1;
        if(n==1){
            return 1;
        }else{
            for(int i=2;i<=n;i++){
                num1=num1*10+1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        int a=2;
        int sn=0;
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            sn=sn+sequen(i)*a;
        }
        System.out.println(sn);
    }
}
