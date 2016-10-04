package pack6;

public class JapumMain {

	public static void main(String[] args) {
		// 추상클래스는 new 안됨
		//Japum ja = new japum();
		Japum jepum = null; 
		
		JapumTv tv = new JapumTv();
		tv.volumeControl();
		tv.volumeshow();
		System.out.println();
		JapumRadio radio = new JapumRadio();
		radio.volumeControl();
		radio.volumeshow();


		
		System.out.println();
		jepum = tv;
		jepum.volumeControl();
		jepum.volumeshow();
		System.out.println("____________");
		jepum = radio;
		jepum.volumeControl();
		jepum.volumeshow();
		
	}

}
