// 학생
// 상태(특징) : 나이, 이름, 성별
// 동작(행위) : 공부한다
public class Student {
	public String name;
	public int age;
	public String gender;
	public void study() {
		System.out.println(name + ", " + age 
				+ ", "+ gender + " 공부를한다.");
	}
}