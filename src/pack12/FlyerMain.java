package pack12;

public class FlyerMain {

	public static void main(String[] args) {
		System.out.println("속도는" + Flyer.FAST);
		
		FlyerBird bird = new FlyerBird();
		FlyerAirplane airplane = new FlyerAirplane();
		
		System.out.println();
		
		FlyerUtill.showdata(bird);
		FlyerUtill.showdata(airplane);
		
		System.out.println();
		FylerBall ball = new FylerBall();
		ball.fly();

	}

}
