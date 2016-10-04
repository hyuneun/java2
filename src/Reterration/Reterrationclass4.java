package Reterration;

public class Reterrationclass4 {
	




	
	
	
 static void main(String[] args) {
	class1 c1 = new class1();
	c1.disp();
	
	class1 c2 = new class1(){
		public void disp(){
			System.out.println("익명 중첩f 클래스의 메소드");
		}
	};
	c2.disp();

}//main	
}//class
class class1{
	public void disp(){
		System.out.println("원본 클래스의 disp메서드");
	}
}
