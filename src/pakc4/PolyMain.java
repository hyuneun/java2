package pakc4;

public class PolyMain {

	public static void main(String[] args) {
		Polycar car1 = new Polycar();
		PolyBus bus1 = new PolyBus();
		PolyTexi texi1 = new PolyTexi();
		System.out.println();
		car1.dispData();
		System.out.println(car1.getspeed());
		
		System.out.println();
		bus1.dispData();
		bus1.show();
		System.out.println(bus1.getspeed());
		
		System.out.println();
		texi1.dispData();
		System.out.println(texi1.getspeed());
		
		System.out.println("___________________");
		Polycar car2 = new PolyBus();
		car2.dispData();//오버라이딩된 메소드 처리
		System.out.println(car2.getspeed());//자신이 가지고잇지 않아서 부모에게서 찾는다
		//car2.show(); 자식고유의 메소드는 안된다 
		
		System.out.println("__________________");
		
		
		
		
		
		
		
		
		
		
	}

}
