package pack13;

public class A {// 바깥쪽 클래스
	int	field1;
	
	public A() {
		System.out.println("a객체생성");
	}
	
	void method1(){
		System.out.println("메소드1수행" + field1);
	}
	
	//인스턴스맴버클래스(클래스의 맴버로 클래스가있을수있다)(내부클래스,중첩클래스)
	class B{//많이쓰는형태(a에 의존한다)(extends는 한번만쓸수잇기떄문에 여러중첩클래스를만들어서 extends한다)
		int	field2;
		
		public B() {
			System.out.println("B오브젝트생성");
		}
		
		void method2(){
			System.out.println("필드2수행" + field2);
		}
	}
	//정적맴버클래스
	static class C{
		int field3;
		
		public C() {
			System.out.println("c오브젝트생성");
		}
		
		void method3(){
			System.out.println("field3 = " + field3);
		}
	}
	
	void a_method4(){//a클래스의 메소드
		System.out.println("메소드4진행");
		//int a = 11; 로컬변수
		
		//로컬클래스(메소드안에 클래스)
		class D{
			int field4;
			
			public D() {
				System.out.println("D 오브젝실행");
			}
			
			void method3(){
				System.out.println("메소드4처리" + field4);
			}
		}
		D d = new D();
		d.field4 = 4;
		d.method3();
	}
	
	//허용범위
	B b2 = new B();	//a클래스의 맴버필드
	C c2 = new C();
	//D d2 = new D(); 쓸수없다(D가 로컬클래스이기때문에)
	
	void test1(){
		B b3 = new B();//일반
		C c3 = new C();//static
	}
	
	static C c4 = new C();
	
	static void test4(){
		//B b4 = new B();//(에러)스태틱은 일반을 부를수없다
		C c5 = new C();//스테틱
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("\n바깥쪽 클래스 객체 생성");
		A a = new A();
		a.field1 = 1;
		a.method1();
		
		System.out.println("\n인스턴스맴버");//많이씀
		//B b = new B(); A에 기생하기때문에 단독으로 쓸수없음
		A.B b = a.new B();
		b.field2 = 2;
		b.method2();
		
		System.out.println("\n정적맴버클래스");
		A.C c = new A.C();
		c.field3 = 3;
		c.method3();
		System.out.println();//a를 안빌려도 사용가능
		C c2 = new C();
		c2.field3 = 4;
		c2.method3();
		
		System.out.println();
		a.a_method4();
		
		System.out.println();
		a.test1();
		A.test4();
	}

}
