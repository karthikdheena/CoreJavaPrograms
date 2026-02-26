package Core;

public class OverMeth {
	
	int nums(int r1, int r2) {
		
		return r1 + r2;
	} 
	
	int nums(int r1, int r2, int r3) {
		
		return r1 + r2 + r3;
	}
	
	double nums1(double r1 , int r2) {
		
		return r1 + r2;
	}
		
public static void main(String[] args) {
	
	OverMeth obj = new OverMeth();
	int nums = obj.nums(20, 30, 40);
	double nums1 = obj.nums1(2.0, 20);
	
		System.out.print(nums);

	}

}
