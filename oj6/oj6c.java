package oj6;

import java.util.Scanner;

public class oj6c {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int [][]arrs=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arrs[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            int numArr=0;
            for(int j=0;j<n;j++){
                numArr=numArr+arrs[i][j];
            }
            System.out.println(numArr);
        }
    }
}
