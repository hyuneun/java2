package pack;
public class Programmermain {
   
		public static void main(String[] args){
			//클래스의 기본이해
			Programmer tom = new Programmer();
			//tom.Programmer(); 호출불가! 생성자호출은 프로그램이한다
			System.out.println("tom별명" + tom.nickName);
			System.out.println("tom스펙" + tom.speck);
			//System.out.println("tom나이" + tom.age);
			//tom = null;
			//System.out.println("tom스펙" + tom.speck);
			tom.nickName = "자바귀신";
			tom.speck += "파이싼";
			System.out.println("tom별명" + tom.nickName);
			System.out.println("tom스펙" + tom.speck);
			tom.displayData();
			tom.setAge(25);
			System.out.println(tom.getAge());
			tom.displayData();
			
			System.out.println("=====================");
			Programmer james = new Programmer();
			james.nickName = "파이선 선수";
			james.displayData();
			james.setAge(330);
			james.displayData();
			
			System.out.println("=====================");
			tom.displayData();
			System.out.println("=====================");
			
			System.out.println("\n static,final에 관하여");
			//String imsi = james.motto; 비권장(클래스로 바로 불러도된다 ststic에 저장되있기때문에)
			//인스턴스안만들어도됨
			String imsi = Programmer.motto;
			System.out.println(imsi);
			
			System.out.println();
			System.out.println(james.PI);
			// james.PI = 12.3; 파이널변수라 고칠수없!
			
			
			//james.myMethod();
			Programmer.myMethod();
			
		}
		
	
}
