package oj4;
import java.util.*;

public class oj4G {
	
//判断是否为偶数
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		int num;
		num=scan.nextInt();
		scan.close();
		
		if(num%2==0) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
	}
}
