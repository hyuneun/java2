package pack15;

import java.util.Scanner;
public class Machine {
	public int money = 100000;
	public int cream = 50;
	public int coffee = 50;
	public int cup = 50;
	
	public void passwardCheck(int password) {
		if(password == 1234){
			jagoGanri();
			backMoney();
		}else{
			System.out.println("비밀번호가 틀립니다");
		}
	}
	
	private void jagoGanri() {
		Scanner sc = new Scanner(System.in);
		System.out.println("재고관리물품선택\n프림, 커피, 컵");
		String jago = sc.next();
		if(jago == "프림"){
			System.out.println("프림재고 : " + cream + "\n얼마나 추가하시겠습니까?");
			int creamPlus = sc.nextInt();
			cream += creamPlus;
		}else if(jago == "커피"){
			System.out.println("커피재고 : " + coffee + "\n얼마나 추가하시겠습니까?");
			int coffeePlus = sc.nextInt();
			coffee += coffeePlus;
		}else if(jago == "컵"){
			System.out.println("컵재고 : " + cup + "\n얼마나 추가하시겠습니까?");
			int cupPlus = sc.nextInt();
			cup += cupPlus;
		}else{
			System.out.println("다시입력하세요");
			jagoGanri();
		}
			
		
	}
	
	private void backMoney() {
		System.out.println("출금기능\n" + "현재잔액 : " + money + "\n얼마를 출금하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int outMoney = sc.nextInt();
		if(outMoney < money){
			money -= outMoney;
		}else{
			System.out.println("잔액이부족합니다");
			backMoney();
		}
		
	}
	
	public void black(){
		Custom c = new Custom();
		Machine m = new Machine();
		m.money += 200;
		m.coffee -= 2;
		m.cup -= 1;
		int m1 = c.inmoney - 200;
		System.out.println("블랙커피" + m1);
		
	}
	
	public void milk(){
		Custom c = new Custom();
		Machine m = new Machine();
		m.money += 200;
		m.coffee -= 2;
		m.cup -= 1;
		int m1 = c.inmoney - 200;
		System.out.println("프림커피 잔돈 : " + m1);
	}
	
	
	
	
	
	
	
	
	
}
