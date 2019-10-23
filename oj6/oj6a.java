package oj6;

import java.util.Arrays;
//收集
import java.util.Collections;
import java.util.Scanner;


public class oj6a {
    static int getIndexOf(Integer[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return i;
            }
        }
        return -1;//如果未找到返回-1
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        Integer[] numbers = new Integer[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scn.nextInt();
        }
//        查找最小值的方法，参数为对象
        int minNum = Collections.min(Arrays.asList(numbers));
        System.out.print(minNum);
        System.out.print(",");
        System.out.println(getIndexOf(numbers, minNum));
    }
}
