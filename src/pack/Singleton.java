package pack;

public class Singleton {
	int kor = 10;
	private static Singleton singleton = new Singleton(); //singleton 패턴
	public static Singleton getInstance(){//하나의 주소로 여러곳에서 중복사용할수있다.
		return singleton;//주소를 리턴
	}
}
