package pack8;

public class SalesMan extends Regular{

	private int sales;//실적
	private double commission;//수수로율(0.25)
		
	public SalesMan(String irum, int nai, int salary, int sales, double commission) {
		super(irum, nai, salary);
		this.sales = sales;
		this.commission = commission;
		
	}
	
	@Override
	public double pay() {
		
		return super.pay() + (sales * commission);
	}
	@Override
	public void print() {
		display();
		System.out.println("수령액 : " + pay());
		
	}
}
