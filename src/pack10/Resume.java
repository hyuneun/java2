package pack10;

public interface Resume {
	String SIZE = "A4"; //public final static
	
	void setIrum(String Irum);
	void setPhone(String Phone);
	void print();
	
	//자바8 이후에 가능
	default void playJava(boolean b){
		if(b){
			System.out.println("자바가능");
		}else{
			System.out.println("자바불가능");
		}
	}
	
	static void changeData(){
		System.out.println("스테틱 메소드 처리가능");
	}
}
