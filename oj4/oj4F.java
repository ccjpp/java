package oj4;
import java.util.*;

public class oj4F {

//	华氏温度和摄氏温度换算
	public static void main(String[] args) {
//		华氏温度
		int fahr;
//		摄氏温度
		double celsius;
		
		Scanner scan=new Scanner(System.in);
		fahr=scan.nextInt();
		
		celsius=(fahr-32)*(5/9.0);
		System.out.print(fahr);
		System.out.print(" ");
		System.out.printf("%.3f",celsius);
	}

}
