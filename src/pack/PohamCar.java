package pack;

public class PohamCar {
	//각종 부품클래스를 조립해서 완성차 제작을 위한 설계도(클래스)
	int speed = 0;
	String ownerName, turnShow;
	PohamHandle handle;  //클래스를 맴버필드로 선언
	
	public PohamCar(){
		handle = new PohamHandle();
		turnShow = "정지";
	}
	
	public PohamCar(String name){
		ownerName = name;
		handle = new PohamHandle(); //클래스의 포함관계
		turnShow = "정지";
	}
	
	public void turnHandle(int quantify){
		if(quantify > 0) turnShow = handle.rightTurn(quantify);
		if(quantify < 0) turnShow = handle.leftTurn(quantify);
		if(quantify == 0) turnShow = handle.straight(quantify);
	}


	
	
	
	
}


















