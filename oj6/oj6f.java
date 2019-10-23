package oj6;

import java.util.Scanner;

public class oj6f {
    public static boolean f(int[][] a,int max){
        for(int i=0;i<a.length-max+1;i++){
            for(int j=0;j<a[0].length-max+1;j++){
                A:
                for(int m=i;m<i+max;m++){
                    for(int n=j;n<j+max;n++){
                        if(a[i][j]!=a[m][n]){
                            break A;
                        }
                        if(m==i+max-1&&n==j+max-1){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int [][] matrix=new int[r][c];
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        in.close();
        int start=0;
        int end=r+1;
        if(c>r){
            end=c+1;
        };
        int mid;
        while(true){
            mid=(start+end)/2;
            if(f(matrix,mid)){
                start=mid;
                max=mid;
            }else{
                end=mid;
            }
            if((end-start)<2){
                break;
            }
        }
        System.out.println(max*max);
    }
}