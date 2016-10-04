package pack;



public class PohamCarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PohamCar tom = new PohamCar("tom");
		System.out.println(tom.turnShow);
		tom.turnHandle(20);
		System.out.println(tom.ownerName + " " + tom.turnShow + " " + tom.handle.quantify);
		
		tom.turnHandle(-10);
		System.out.println(tom.ownerName + " " + tom.turnShow + " " + tom.handle.quantify);
		
	}

}
