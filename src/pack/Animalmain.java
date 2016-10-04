package pack;

import java.awt.Color;

public class Animalmain {

	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.display();
		tiger.display(2);
		tiger.display("호돌이");
		tiger.display(3, "호랑이");
		tiger.display("호랭이", 1000);
		tiger.display(1234, 4321);
		
		System.out.println("\n 생성자 오버로드연습");
		Animal dog = new Animal();
		dog.display();
		
		System.out.println();
		Animal gugu = new Animal(5);
		gugu.display();
		
		System.out.println();
		Animal cat = new Animal("고양이");
		cat.display();
				
		System.out.println("********");
		Animal panda = new Animal("판다", 7);
		panda.display();
		System.out.println(Animal.Mouse);
		
		
	}

}
