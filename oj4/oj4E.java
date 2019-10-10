package oj4;
import java.util.*;

public class oj4E {
//	计算需要支付的金额
	public static void main(String[] args) {
		int manNum;
		double money;
		
		Scanner scan=new Scanner(System.in);
		manNum=scan.nextInt();
		
		if(manNum>3) {
			money=95*manNum*0.85;
		}else {
			money=95*manNum;
		}
		System.out.printf("%.2f",money);
	}
}

