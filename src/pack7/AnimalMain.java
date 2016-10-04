package pack7;

public class AnimalMain {

	public static void main(String[] args) {
		AniCow cow = new AniCow();
		System.out.println(cow.name() + " " + cow.eat() + " " + cow.action());
		cow.print();
		
		System.out.println();
		AniLion lion = new AniLion();
		System.out.println(lion.name() + " " + lion.eat() + " " + lion.action());
		lion.print();
		lion.eatOther();
		System.out.println("\n 별도의클래스사용");
		System.out.println();
		animalFind.find(cow);
		System.out.println();
		animalFind.find(lion);
		
		//AniDog dog = new AniDog();
		//System.out.println(dog.name());
		
		AniDogWolf wo = new AniDogWolf();
		System.out.println(wo.name());
		
		
		
		
		
		
		
	}

}
