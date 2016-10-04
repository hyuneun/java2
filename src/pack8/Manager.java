package pack8;

public class Manager extends Regular{
	private double incentive;//관리수당
	
		public Manager(String irum, int nai, int salary) {
			super(irum, nai, salary);
			if(salary >= 2500000){
				incentive = salary * 0.6;
			}else if(salary >= 2000000){
				incentive = salary * 0.5;
			}else if(salary < 2000000){
				incentive = salary * 0.4;
			}
		}
		
	
		@Override
		public double pay() {
			return super.pay() + incentive;
		}	
			
		
		@Override
		public void print() {
			display();
			System.out.println("수령액 : " + this.pay());
		}
	
	
}
