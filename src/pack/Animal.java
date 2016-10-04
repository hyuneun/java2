package pack;

public class Animal {
	private int leg = 4;
	private int age;
	private String name;
	public final static int Mouse = 1;
	
	public Animal(){
		//생성자 -생략가능 - 컴파일러가 생성해줌
		System.out.println("기본생성자");
	}
	
	public Animal(int leg){ //생성자 오버로딩
		this.leg = leg;
	}
	
	public Animal(String name){ //생성자 오버로딩
		this.name = name;
	}
	
	public Animal(String name, int age){ //생성자 오버로딩
		this(); // 생성자는 생성자를호출할수있다(한개만) 단 가장먼저적는다.
		//this(10);
		this.name = name;
		this.age = age;
		
		
	}
	
	
	public void display(){
		System.out.println(leg + "--" + age + "--" + name);
	}

	public void display(int leg_num){ //mothod overload *재명명 //클래스안에 메소드이름이 두개존재
									  //이름은같지만 arg의 타입,갯수,순서가 달라야 성립된다
		leg = leg_num;
		System.out.println(leg + "--" + age + "--" + name);
	}

	public void display(String aname){
		name = aname;
		System.out.println(leg + "--" + age + "--" + name);
	}

	public void display(int nai, String aname){ //갯수다르니까된다
		name = aname;
		age = nai;
		System.out.println(leg + "--" + age + "--" + name);
	}
	
	public void display(String aname, int nai){ //순서다르니까 됨다
		name = aname;
		age = nai;
		System.out.println(leg + "--" + age + "--" + name);
	}

	public void display(int leg_num, int nai){ //순서다르니까 됨다
		leg = leg_num;
		age = nai;
		System.out.println(leg + "--" + age + "--" + name);
		
	}
	
	}
	









































