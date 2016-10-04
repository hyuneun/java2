package pack12;
	//    ┌ 어댑터 클래스 - flyer를 받으나 스스로는 new 할수없다
public abstract class AdapterFlyer implements Flyer{

	@Override
	public void fly() {
		
	}
	
	@Override
	public boolean isAnimal() {
		return false;
	}
	
	
}
