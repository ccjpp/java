package oj4;
import java.util.*;

public class oj4c {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num;
		int numPrice=0;
		num=scan.nextInt();
		
		if(num>0&&num<=4) {
			numPrice=num*4+5;
		}else if(num>=5&&num<10) {
			numPrice=num*3+5;
		}else if(num>=10) {
			numPrice=num*3;
		}
		System.out.println(numPrice);

	}

}
