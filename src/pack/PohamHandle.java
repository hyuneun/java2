package pack;

public class PohamHandle {
	//회전을 위한 객체
	int quantify; //회전량
	
	public PohamHandle() {
		quantify = 0;
	}
	
	public String leftTurn(int quantify){
		this.quantify = quantify;
		return "좌회전";
	}
	
	public String rightTurn(int quantify){
		this.quantify = quantify;
		return "우회전";
	}
	
	public String straight(int quantify){
		this.quantify = quantify;
		return "직진";
	}
	
	
	
	
	
	
	
	
	
	
	
}
