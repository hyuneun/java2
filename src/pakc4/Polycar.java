package pakc4;

public class Polycar {
	protected int speed = 50;
	
	public Polycar() {
		System.out.println("나는 자동차야~~");
	}
	
	public void dispData(){
		System.out.println("속도" + speed);
	}
	public int getspeed(){
		return speed;
	}
}
