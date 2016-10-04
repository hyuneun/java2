package pack2;
//import java.lang.*;───────────┬─모든 클래스는 오브젝트를 상속받는다(생략됨)
public class Student extends Object{
	/*
	@Override
	public String toString(){
		return "자바만세";
	}
	*/
	
	protected String name;
	protected int grade;
	protected String gender;
	
	public Student() {
		
	}
	
	public Student(String name, int grade, String gender) {
		this.name = name;
		this.grade = grade;
		this.gender = gender;
	}
	
	public void study(){
		System.out.println("학생은 공부를 해야한다,스승을 헐뜯지말고.....");
	}
}
