package com.test8;
class A extends Object {	
	public String toString() {
		System.out.println(super.toString());
		return "�ȳ��ϼ���";
	}
}
class B extends A {
	public String toString() {
		return "�ݰ�����";
	}
}
public class Test1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		A a2 = new B();
		System.out.println(a2);
	
	}
}