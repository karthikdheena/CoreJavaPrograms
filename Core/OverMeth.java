package Core;

public class OverMeth {
	
	 int num (int r1,int r2 ) {
		
		return r1 + r2 ;
	}
	
	 int num (int r1, int r2, int r3) {
		 
		return r1 + r2 + r3;
	}
	
	double num (double r1, int r2) {
		
		return r1 + r2;
	} 							// Method OverLoading

	public static void main(String[] args) {
		
		OverMeth obj = new OverMeth();
		int num = obj.num(10, 20, 30);
		double num1  = obj.num(2.0, 10);	
		
		System.out.println(num);
		

	}

}
