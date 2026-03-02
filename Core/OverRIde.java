package Core;

class Math{
	
	public int add(int r1 , int r2) {
		
		return r1 + r2;
	}
}

class Math1 extends Math{
	
	public int add(int r1 , int r2 ) {			// Method Overriding
		
		return r1 + r2 + 1;
		
		
	}
}
public class OverRIde {

	public static void main(String[] args) {
		
		Math1 obj = new Math1();
		
		int r1 = obj.add(20, 40);
		
		System.out.println(r1);
		

	}

}
