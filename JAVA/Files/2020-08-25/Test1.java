class MyClass{
	public static void messge() {
		System.out.println("�޼��� ���");
	}
	public static String message2() {
		return "�ȳ��ϼ���";
	}
}
public class Test1 {
	public static void messge() {
		System.out.println("�޼��� ���");
	}
	public static String message2() {
		return "�ȳ��ϼ���";
	}
	public static void main(String[] args) {
		messge();
		String msg = message2();
		System.out.println(msg);
		MyClass.messge();
		String msg2 = MyClass.message2();
		System.out.println(msg2);
	}
}