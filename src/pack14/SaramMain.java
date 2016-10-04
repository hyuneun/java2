package pack14;

public class SaramMain {

	public static void main(String[] args) {
		Saram saram = new Saram();
			System.out.println(saram.getIr());

			System.out.println();
			SaramTom tom = new SaramTom();
			Saram saram2 = tom.getSaram();
			System.out.println(saram2.getIr());
	}

	
}
