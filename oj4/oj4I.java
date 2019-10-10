package oj4;
import java.util.*;

public class oj4I {
    static int reversal(int num) {
        int num1=num%10;
         
        int num2=(num%100)/10;
         
        int num3=(num%1000)/100;
         
        int num4=num/1000;
         
        if(num1==0) {
            return num2*100+num3*10+num4;
        }
        return num1*1000+num2*100+num3*10+num4;
    }
 
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num ,reNum;
        for(int i=0;i<5;i++) {
            num=scan.nextInt();
            reNum=reversal(num);
            System.out.println(reNum);
        } 
    }
}