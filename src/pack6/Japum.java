package pack6;

abstract public class Japum { //추상클래스(new 할수없고 부모로만사용)
	public int volume = 0;
	
	public Japum() {
	System.out.println("추상 클래스 생성자");
	
	}
	
	
	abstract public void volumeControl(); // 바디가 없는메소드(추상매소드) 꼭 오버라이딩해야한다(강제)
	
	public void volumeshow(){//일반메소드
		System.out.println("소리크기 : " + volume);
	}
}
