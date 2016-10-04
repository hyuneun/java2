package pack5;

public class PolyProductMain {

	public static void main(String[] args) {
		PolyProduct product = null; // 추상적

		PolyRadio radio = new PolyRadio();
		radio.setValume(5);
		System.out.println(radio.getValume());
		radio.volumeControl();
		
		System.out.println("___________");
		PolyTv tv = new PolyTv();
		tv.setValume(10);
		System.out.println(tv.getValume());
		tv.volumeControl();
		tv.tvshow();
		
		System.out.println("\n 다형성________");
		product = radio;
		product.volumeControl();
		System.out.println();
		product = tv;
		product.volumeControl();
		
	}

}
