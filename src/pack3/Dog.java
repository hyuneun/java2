package pack3;

public class Dog {
	//개과의 동물들이 공통적으로 갖는 맴버 선언한 원형 클래스
	private String name = "개";
	public Dog() {
		
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String callName(){
		return "종류는 " + name;
	}
	
	public void print() {
		System.out.println(name + "는 지구에 산다.");
	}
	
	
}
