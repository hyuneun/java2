package pack8;

public class SawonMain {

	public static void main(String[] args) {
		//임시직
		Temporart tem = new Temporart(20, 90000, 21, "홍길동");
		tem.print();
		System.out.println();
		Regular reg = new Regular("홍길동", 23, 1234000);
		reg.print();
		System.out.println();
		SalesMan sal = new SalesMan("한송이", 25, 2345000, 3000, 0.25);
		sal.print();
		System.out.println();
		Manager man = new Manager("한국인", 27, 2555000);
		man.print();
	}

}
