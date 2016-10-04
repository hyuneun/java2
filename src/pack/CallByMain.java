package pack;

public class CallByMain {

	public static void main(String[] args) {
		// 메소드 호출시 인자(기본형,참조형)전달
		//			  call by value,call by reference
		CallBy1 my = new CallBy1();
		CallBy2 your = new CallBy2();
		System.out.println("원래 a :" + my.a + " ,b : " + my.b);
		
		your.ex(my.a, my.b);//기본값이 바뀌지 않는다(기본값)
		System.out.println("원래 a :" + my.a + " ,b : " + my.b);
		System.out.println();
		your.ex(my.c);//참조형을 인자로 사용했을때 기본값이 바뀐다(주소의 값을 건드리기때문에)
		System.out.println("원래 a :" + my.c[0] + " ,b : " + my.c[1]);
		System.out.println();
		your.ex(my);//참조형을 인자로 사용했을때 기본값이 바뀐다(주소의 값을 건드리기때문에)
		System.out.println("원래 a :" + my.a + " b : " + my.b);
	}

}
