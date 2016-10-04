package pack;

public class CallBy2 {
	public void ex(int a, int b){ //인수로 기본형
		int imsi = a; //a ,b값을 맞바꿀때 따로저장공간을만듬
		a = b;
		b = imsi;
		System.out.println("메소드내의 a:" + a + " b값" + b);
	}
	
	public void ex(CallBy1 data){//인수로 참조형
		int imsi = data.a;
		data.a = data.b;
		data.b = imsi;
		System.out.println("a : " + data.a + " b: " + data.b);
	}
	
	public void ex(int[] ar){ //참조형
		int imsi = ar[0];
		ar[0] = ar[1];
		ar[1] = imsi;
		System.out.println("a : " + ar[0] + " b : " + ar[1]);
		
	}
}
