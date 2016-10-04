package other;

//import pack.Bank;
import pack.*;//pack 안에것을 불러올수잇다
public class BankMain {

	public static void main(String[] args) {
		//pack.Bank james = new pack.Bank();
		Bank tom = new Bank();
		System.out.println(tom.getMoney());
		tom.dePosit(5000);
		tom.withDraw(2000);
		System.out.println(tom.getMoney());
		
		System.out.println();
		Bank oscar = new Bank(2000);
		System.out.println(oscar.getMoney());
		oscar.dePosit(10000);
		oscar.withDraw(5000);
		System.out.println(oscar.getMoney());
		
		System.out.println("객체의 주소관련 이야기--------");
		System.out.println(tom);
		System.out.println(oscar);
		System.out.println(tom.hashCode());
		System.out.println(oscar.hashCode());
		Bank james = null;	
		System.out.println(james);
		james = oscar;
		System.out.println(james.getMoney());
		
		if(james == tom){//	 ┐
	  //if(james.equals(tom))┘─ 같은의미 equals(참조형을 비교할때 사용한다)
			System.out.println("같다");
		}else{
			System.out.println("틀리다");
		}
		
		System.out.println("String 클래스의 비교에 대하여-----------");
		
		String ss1 = "kor";			//일반형처럼 주소가 만들어짐  
		String ss2 = new String();//참조형처럼  주소가 만들어진다
		ss2 = "kor";				// 주소가 만들어지는 영역이 다르다
		String ss3 = new String("kor");
		System.out.println(ss1 + " " + ss2 + " " + ss3);
		
		if(ss1 == ss3){//String을 비교할때는 반드시 equals 사용
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	
		if(ss1.equals(ss3)){//String을 비교할때는 반드시 equals 사용
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		

		System.out.println(ss1.hashCode());
		System.out.println(ss2.hashCode());
		System.out.println(ss3.hashCode());
		
		System.out.println("배열관련~~~~~~~~~~~~~~~~~~");
		int[] ar = {1,2,3};
		System.out.println(ar);
		System.out.println(ar[0] + " " + ar[1]);
		
		System.out.println();
		int[][] ar2 = {{1,2,3},{4,5,6,7}};
		System.out.println(ar2[0]);
		System.out.println(ar2[0]);
		System.out.println(ar2[1][0]);
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
































