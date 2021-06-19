package com.study;

public class VarDeemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		x=1;y=2; //注意x和y之间要用分号
		//print为不换行打印
		System.out.print("x="+x);
		System.out.print("y="+y);
		System.out.println(); //换行
		System.out.print("~~~~~~~~~~~~~~");
		System.out.println();
		int x1=3,y1=4;
		System.out.print("x1="+x1);
		System.out.println();  
		System.out.print("y1="+y1);
		System.out.println(); //换行
		System.out.print("~~~~~~~~~~~~~~");
		System.out.println();
		System.out.print(x1 + "," + y1 + "\n"+"1"); // \n是转义字符，表示换行
		System.out.print(x1 + ',' + y1 + '\n'+'1'); // 当所有数据类型为整形、浮点型、char类型时，会自动做加法运算
		System.out.print("\n\'"+ "hello"+"\'\n"); //转义字符演示
		
		//用科学计数法表示浮点型数据
		double d1 = 1.23E5; //等价于x10^5
		float f1 = 1.23e5f;
		double d2 = .2;
		float f2 = .2f;
		System.out.println("d1="+d1);
		System.out.println("f1="+f1);
		System.out.println("d2="+d2);
		System.out.println("f2="+f2);
	}

}
