package pack15;

import java.util.Scanner;

public class Custom extends SellCheck {
	Scanner sc = new Scanner(System.in);
	Machine m = new Machine();
	public int inmoney;
	
	public void coffeeChoice() {
		System.out.println("커피선택(블랙/프림)");
		String jago = sc.next();
		if(jago.equals("블랙")){
			m.black();
		}if(jago.equals("프림")){
			m.milk();
		}
		
	}
	
	public void moneyInsert() {
		System.out.println("돈투입");
		int money = sc.nextInt();
		this.inmoney = money;
		jondonCheck(money);
	}
	
}
