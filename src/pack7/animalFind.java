package pack7;

public class animalFind {

	public static void find(Animal animal){
		animal.print();
		
		if(animal instanceof AniCow){ //instanceof : 객체타입비교연산자(리턴값이 참아님 거짓)
			Animal a = animal;
			System.out.println("이름 : " + a.name());
		}else if(animal instanceof AniLion){
			System.out.println("이름 : " + animal.name());
		}
		else{
			System.out.println("기타동물");
		}
	}

}
