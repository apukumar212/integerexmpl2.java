package com.pack1;

public class ClassB 
{
	void meth1()
	{
		int a=10;
		System.out.println(a);
		System.out.println(a+90);
		System.out.println("a");
		System.out.println(a+a);
		ClassB aobj=new ClassB();
		aobj.meth2();
	}
	void meth2()
	{
		System.out.println("meth2() called");
		int a=100;
		int b=9;
		System.out.println("substraction : "+(a+b));
	}
	public static void main(String[] args) {
		{
			System.out.println("start");
			ClassB aobj=new ClassB();
			aobj.meth1();
			System.out.println("end");
		}
	}
	
}
