package oj4;
import java.util.*;

public class oj4H {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan=new Scanner(System.in);
		int numa=scan.nextInt();
		int numb=scan.nextInt();
		if(numb==0) {
			System.out.print("error");
		}else if(numa%numb==0) {
			System.out.print(numa/numb);
		}else {
			System.out.print(numa/numb);
			System.out.print(" ");
			System.out.print(numa%numb);
		}
	}
}
