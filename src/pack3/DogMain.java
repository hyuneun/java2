package pack3;

public class DogMain {

	public static void main(String[] args) {
		/*
		Dog dog = new Dog();
		dog.print();
		System.out.println(dog.callName());
		원형클래스는 성격상 스스로는 객체를 만들어 사용하지 않는것이 일반적이다.
		*/
		
		HouseDog hd = new HouseDog("집개");
		hd.show();
		hd.print();
		System.out.println(hd.callName());
		hd.getName();
		
		System.out.println();
		WolfDog wd = new WolfDog("늑대");
		wd.print();
		wd.display();
		System.out.println(wd.callName());
		
		System.out.println();
		WolfDog bushdog = wd; //주소를 치환
		bushdog.print();
		bushdog.display();
		System.out.println(bushdog.callName());
		
		System.out.println();
		
		Dog dog1 = new Dog();
		dog1.print();
					//hd = dog1; error!
		dog1 = hd;//자식객체변수 를 부모객체에게 줄수있다(프로모션) 반대는 불가능(캐스팅으로 할수는있다)
		dog1.print();//오버라이딩이 되어있는 메소드만 호출가능
		//dog1.show();//자식고유 메소드는 호출할수없다 "불간섭의원칙"
		dog1 = wd;
		dog1.print();
	} 

}
