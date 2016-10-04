package pack;

public class Bank {
	private int money = 1000;
	int imsi = 1;			//	friendly 같은 패키지에서만 쓸수있다
	public int  imsi2 = 1; //  public 같은프로젝트에서만쓸수잇다
	public Bank(){
		
	}
	
	public Bank(int money){
		this.money += money; 
	}
	
	public void dePosit(int amount){ //입금
		if(amount > 0) money += amount;
	}
	
	public void withDraw(int amount){
		if(amount > 0 && money - amount >= 0){
			money -= amount;
		}else{
			System.out.println("출금액이 너무 많습니다");
		}
	}
	
	public int getMoney() {
		return money;

	}
}
