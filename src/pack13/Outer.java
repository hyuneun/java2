package pack13;

public class Outer {
	private int a;
	Inner inner;
	
	
	public Outer() {
		a = 10;
		inner = new Inner();
	}
	public void aa() {
		System.out.println("외부에있는 aa메소드");
		bb();
		System.out.println("a: " + a);
		//System.out.println("Outer a : " + a + "Inner ia : " + ia); 외부에서는 내부것을 쓸수없다
		System.out.println("Outer a : " + a + "Inner ia : " + inner.ia);
		//cc(); 외부에서는 내부것을 쓸수없다
		inner.cc();
	}
	
	private void bb() {
		System.out.println("외부에있는 bb메소드");

	}
	class Inner{//내부(중첩)클래스 이 안에서만 쓴다
		private int ia;
		
		public Inner() {
			ia = 20;  
		}
		
		public void cc() {
			System.out.println("내부cc메소드");
			System.out.println("내부에있는" + ia + " 외부에있는 a" + a);//내부에서는 외부맴버를 자유롭게 
			bb();													//부를수있다
		}
	
		class InnerInner{	//내부클래스는 다시 내부클래스를 가질수있다(잘안씀)
			
		}
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.aa();
		
		System.out.println();
		/* 거의안쓴다 
		//Inner inner = new Inner(); 접근x
		Outer.Inner inner = outer.new Inner();
		inner.cc();
		Outer.Inner.InnerInner inner2 = inner.new InnerInner();
		 */
	}

}
