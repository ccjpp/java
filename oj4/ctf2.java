package oj4;

public class ctf2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte[] arr_1 = { 121, 113, 113, 80, 68, 74, 120, 84, 118, 71, 105, 71, 69, 72, 109, 100, 125, 114, 75, 112, 69, 100, 109, 81, 120, 74, 91, 71, 69, 97, 79, 96, 124, 15, 20, 116, 125, 73, 82, 87, 121, 75, 121, 71, 112, 113, 79, 101, 119, 114, 75, 104, 125, 73, 113, 101, 117, 74, 83, 69, 72, 72, 24, 18, 124, 87, 112, 84, 115, 110, 96, 26 };
		/* 12 */     String a = "";
		/* 13 */     for (int i = 0; i < arr_1.length; i++) {
		/* 14 */       if (i % 2 == 0) {
		/* 15 */         a = a + (char)((arr_1[i] ^ 0x20) - 3);
		/*    */       } else {
		/* 17 */         a = a + (char)((arr_1[i] ^ 0x20) + 3);
		/*    */       } 
		/*    */     } 
		System.out.println("a:");
		System.out.println(a);

	}

}
