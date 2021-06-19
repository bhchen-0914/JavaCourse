package com.study5_array;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		//定义一个三行两列的整型二维数组intArray
        int intArray[][] = new int[3][2];

       //从键盘输入学生成绩，要求输入顺序与效果图一致
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个学生的语文成绩：");
        int student1_chinese = sc.nextInt();
        intArray[0][0] = student1_chinese;
        
        System.out.println("请输入第1个学生的数学成绩：");
        int student1_math = sc.nextInt();
        intArray[0][1] = student1_math;
        
        System.out.println("请输入第2个学生的语文成绩：");
        int student2_chinese = sc.nextInt();
        intArray[1][0] = student2_chinese;
        
        System.out.println("请输入第2个学生的数学成绩：");
        int student2_math = sc.nextInt();
        intArray[1][1] = student2_math;
        
        System.out.println("请输入第3个学生的语文成绩：");
        int student3_chinese = sc.nextInt();
        intArray[2][0] = student3_chinese;
        
        System.out.println("请输入第3个学生的数学成绩：");
        int student3_math = sc.nextInt();
        intArray[2][1] = student3_math;

       //求语文的总成绩和平均分
         int sum_chinese = intArray[0][0]+intArray[1][0]+intArray[2][0];
         System.out.println("语文总成绩为："+sum_chinese);
         
         System.out.println("语文平均分为："+(sum_chinese/3));
       //求数学的总成绩和平均分
         int sum_math = intArray[0][1]+intArray[1][1]+intArray[2][1];
         System.out.println("数学总成绩为："+sum_math);
         System.out.println("数学平均分为："+(sum_math/3));

	}

}
