package pack12;

public class FlyerAirplane implements Flyer{

	public FlyerAirplane() {
		System.out.println("뱅기");
	}
	
	@Override
	public void fly() {
		System.out.println("엔진소리");
		
	}
	
	@Override
	public boolean isAnimal() {
		return false;
	}
}
