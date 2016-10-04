package pack12;

public class FlyerBird implements Flyer {
	
		public FlyerBird() {
		System.out.println("새");
		}
	
	
	@Override
	public void fly() {
		System.out.println("난다");
		
	}
	
	@Override
	public boolean isAnimal() {
		return true;
	}
}
