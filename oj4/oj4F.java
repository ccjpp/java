package oj4;
import java.util.*;

public class oj4F {

//	�����¶Ⱥ������¶Ȼ���
	public static void main(String[] args) {
//		�����¶�
		int fahr;
//		�����¶�
		double celsius;
		
		Scanner scan=new Scanner(System.in);
		fahr=scan.nextInt();
		
		celsius=(fahr-32)*(5/9.0);
		System.out.print(fahr);
		System.out.print(" ");
		System.out.printf("%.3f",celsius);
	}

}
