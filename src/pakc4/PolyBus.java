package pakc4;

public class PolyBus extends Polycar{
	private int passenger = 10;
	
	public void show(){
		System.out.println("버스");
	}
	
	@Override
	public void dispData() {
		System.out.println("버스의 승객은 " + passenger);
		System.out.println("버스의 속도는 " + speed);
	}


























}
