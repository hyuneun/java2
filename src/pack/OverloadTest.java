package pack;

public class OverloadTest {
	public int coffee(int money){ //커피기본값은 200원
		return coffee(money, 200);
	}
	
	public int coffee(int money, int coffeeValue){
		if(money >= 0){
			return money / coffeeValue;
		}else{
			return -1;
		}
	}
	
	public void printCoffee(int cups){
		if(cups > 0){
			System.out.println("커피" + cups + "잔");
		}else{
			System.out.println("금액부족");
		}
		}
	public void coffIn(int money){
		money += 300;
		System.out.print("method coffIn : ");
		System.out.println("money는" + money);
	}
	
	public void coffIn(String money){
		money = money.replace("m", "y"); // replace 앞에걸 뒤어걸로 바꿈
		System.out.print("method coffIn : ");
		System.out.println("money는" + money);
	}
	
	
		public static void main(String[] args){
			int myMoney = 500;
			
			OverloadTest test = new OverloadTest();
			int cups = test.coffee(600);
			test.printCoffee(300);
			
			System.out.println();
			cups = test.coffee(myMoney, 300);
			test.printCoffee(cups);
			int noChange = 400;
			test.coffIn(noChange);
			
			System.out.println();
			String sChange = "tom";
			test.coffIn(sChange);
			System.out.print("main :");
			System.out.println("sChange" + sChange);
	}
}
