package Core;

class HI{
	
	double nums = 2.0;
	
	int  N = (int)nums;				// type casting
	
	public void show() {
		
		System.out.println("hello");
	}
}

class he extends HI{
	
	public void show1() {
		
		System.out.println("Bye");
	}
}

public class Casting {

	public static void main(String[] args) {
		
	//	HI obj = new he(); 
	 HI obj = (HI) new he(); // upcasting 
		
		obj.show();
		
		
		he obj1 = (he) obj; // DOwncasting
		
		
		
		
		
		

	}

}
