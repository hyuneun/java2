package pack5;

public class PolyProduct {	//가전제품의 원형 클래스
							//추상메소드 -- 다형성을위해 오버라이딩을 강제한다(바디가없다)
							//추상클래스 -- 추상메소드를 포함하고있는 클래스
	private int valume = 0;
	
	public void volumeControl(){ //하위클래스에서 오버라이딩을 기대(권장)
		
	}

	public int getValume() {
		return valume;
	}

	public void setValume(int valume) {
		this.valume = valume;
	}
	
}
