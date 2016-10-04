package pack;

import java.util.Calendar;

public class Singletonmain {

	public static void main(String[] args) {
		Singleton s1 = new Singleton();
		Singleton s2 = new Singleton();
		System.out.println(s1 + " \n" + s2);
		System.out.println(s1.kor);
		
		System.out.println();
		Singleton s3 = Singleton.getInstance();//singleton주소를 받는다
		Singleton s4 = Singleton.getInstance();//singleton주소를 받는다
		System.out.println(s3 + "\n" + s4);
		s3.kor = 20;
		System.out.println(s3.kor);
		System.out.println(s4.kor);
		
		System.out.println();
		//Calendar calender = new Calendar;
		Calendar calender = Calendar.getInstance();
		int y = calender.get(calender.YEAR);//클래스이름으로 불리고 대문자(static final)
		System.out.println(y);
		
		Calendar calender2 = Calendar.getInstance();
		int m = calender2.get(calender.MONTH) + 1;
		System.out.println(m);
	}

}
