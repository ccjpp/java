package oj4;
import java.util.*;

public class oj4A {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Scanner scan=new Scanner(System.in);
		int profit ;
		double bonus;
		profit=scan.nextInt();
		
		if(profit<100000) {
			bonus=profit*0.1;
		}else if(profit>100000&&profit<=200000) {
			bonus=10000+(profit-100000)*0.075;
		}else if(profit>200000&&profit<=400000) {
			bonus=17500+(profit-200000)*0.05;
		}else if(profit>400000&&profit<=600000) {
			bonus=27500+(profit-400000)*0.03;
		}else if(profit>600000&&profit<=1000000) {
			bonus=33500+(profit-600000)*0.015;
		}else{
			bonus=39500+(profit-1000000)*0.01;
		}
		int bonusint=(int)bonus;
		System.out.println(bonusint);
	}
}
