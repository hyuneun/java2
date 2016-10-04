package pack;

import java.util.Scanner;

public class Machine {
	//private int cupCount;
	CoinIn co;
	
	public Machine() {
		
	}
	
	public void showData(){
		co = new CoinIn();
		Scanner sc = new Scanner(System.in);
		System.out.println("동전을 입력하세요");
		int dong= sc.nextInt();
		System.out.println("몇잔을 원하세요");
		int jan = sc.nextInt();
		if(dong >= 200){
			//co.calc(dong, jan);
			System.out.println("커피" + jan + "잔 잔돈 :" + co.calc(dong, jan));
		}else{
			System.out.println("돈이부족합니다");
			return;
		}
	
		
	}
	
	
	
	
}
