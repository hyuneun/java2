package pack;
//┌어디서든지 쓸수있다는뜻(공공)
public class Car {	//접근지정자 기타제한자 class 클레스명(대문자로 시작)
	int wheel;		//맴버필드(전역변수)
	private int airbag = 1; 
// 프라이빗 맴버는 다른클래스에서 쓸수없다    │
//접근지정자 기타제한자 TYPE(형) 필드명
	private int speed;
	public String irum;
	public Car(){ // 생성자(맴버메소드 일종) 클래스와 이름이같고 반환값x
		System.out.println("생성자");
	}

	public void abc(){ //맴버메소드 : 접근지정자 기타제한자 반환형 메소드형(인자,,,){}
		System.out.println("abc메소드를 수행");
		System.out.println("에어백수는" + airbag);
		System.out.println("바퀴수는" + wheel);
		
		def(); //메소드호출
		int result = korea(50); //실인수
		System.out.println("결과는" + result);
	}

	private void def(){
		System.out.println("def 메소드수행");
	}
	private int korea(int jumsu) { //가인수
		return jumsu + 50;
	}
		
		//setter, getter 약속을지키자 첫소문자 단어바뀌면 대문자
	public void setAirBag(int air, int password){
		if(password == 123){
			airbag = air;}
		else{
			System.out.println("ㅗ");
		}
		}
	public int GetAirBag(){
		return airbag;
	}
	public int getSpeed() {
		return speed;
	}
	
	
}
