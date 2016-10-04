package pack;

public class Programmer {
	//public String nickName = "";
	public String nickName;
	//private int age = 0;
	private int age; //값을안주면 초기치 0이됨
	String speck = "자바";
	public static String motto = "미친개";	//static 값		  지역변수에 쓰지마
	public final double PI = 3.14159227;    //final 수정불가값(대문자로준다) 지역변수에 쓰지마
	
	public Programmer() {
	System.out.println("난생성자1 객체생성시 초기화담당");
	System.out.println("초기화 없을때는 안적이도됨,없단얘기는아님");
	age = 19;
}
	public void displayData(){
		String sp = reSpeck();
		System.out.println("별명이 " + nickName + "인" + age + "살의 기술은" + sp);
	}
	private String reSpeck(){
		return "보유기술" + speck;
	}
	public void setAge(int age){ //setter
		this.age = age; //맴버필드에 지역변수 값을치환
		//this 자신클래스 안의 값을쓸때
	}
	public int getAge(){	//getter
		return age;
		
	}
	public static void myMethod(){
	System.out.println("클래스의 이름으로 호출가능 static");
	//System.out.println(age); age는객체가 만들어지고 생성되기때문에 이미만들어져있는 static에서 부를수없다!
	System.out.println(motto); //static맴버는 static만 부를수잇다!
	}














}
