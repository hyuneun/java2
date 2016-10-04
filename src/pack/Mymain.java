package pack;

public class Mymain {

	public static void main(String[] args) {
		// 응용 프로그램 시작을 위한 클라쓰
		int a = 10;
		System.out.println(a);
		System.out.println();
		
		Car sonata = new Car(); //객체생성 (인스턴스)
		//sonata : 객체변수,참조변수,인스턴스변수
		//sonata.~~~ 괄호가있으면 메소드 없으면 필드
		
		
		//	|	|			└생성자호출
		// 	|	└---┐
		//  |		|[해시코드]
		// static | stack | 	heap
	//		Car		sonata		car(whell...)
	//		|		   |		  |
	//주기억장치 	 객체변수에 (주소)를 기억시킨다
	sonata.abc();//def()도 실행시킬수있다
	
	System.err.println(sonata.wheel);
	sonata.setAirBag(8, 123);
	sonata.abc();
	System.out.println();
	
	System.out.println(sonata.GetAirBag()); //private의 맴버의값얻기 getter얻,setter참
	
	
	
	
}
}
