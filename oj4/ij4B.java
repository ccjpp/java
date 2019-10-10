package oj4;
import java.util.*;

public class ij4B {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int score;
		while(scan.hasNext()) {
			score=scan.nextInt();
			
			if(score>=0&&score<60) {
				System.out.println("E");
			}else if(score>59&&score<70) {
				System.out.println("D");
			}else if(score>69&&score<80) {
				System.out.println("C");
			}else if(score>79&&score<90) {
				System.out.println("B");
			}else if(score>89&&score<=100) {
				System.out.println("A");
			}else {
				System.out.println("Score is error!");
			}
			
		}

	}

}
