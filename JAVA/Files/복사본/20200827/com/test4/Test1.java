package com.test4;
class A {
	int a;
	A(){ a = 100;}
	A(int a) { this.a = a; }
}
class B extends A {
	B(){ super(4000); }
	void bMethod() { System.out.println(a); }
}
public class Test1 {
	public static void main(String[] args) {
		B b = new B();
		b.bMethod();
	}
}
