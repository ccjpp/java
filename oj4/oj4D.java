package oj4;
import java.util.*;

public class oj4D {
	
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	int time=scan.nextInt();
	scan.close();
	
	switch(time) {
	case 1:
	case 3:
	case 5:
		System.out.print("NO");
		break;
	case 2:
	case 4:
	case 6:
	case 7:
		System.out.print("YES");
	}

}
}
