package Core;

class Calc{
	
	public int add(int r1 , int r2) {
		
		return r1 + r2;
	}
	
	public int sub(int r1 , int r2) {
		
		return r1 - r2;
	}
}

class Advcalc extends Calc{
	
	public int multi(int r1 , int r2) {		// Single inheritance
		
		return r1 * r2;
	}
	
	public int div(int r1 , int r2) {    
		
		return r1 % r2;
	}
}

class Scicalc extends Advcalc{                 //Multiple inheritance
	
	public double pow(int r1 ,int r2) {
		
		return Math.pow(r1, r2);
	}
}


public class Inherit {

	public static void main(String[] args) {	
		
		Scicalc nums = new Scicalc();
		
		 int n1 = nums.add(20, 60);
		 int n2 = nums.sub(40, 50);
		 int n3 = nums.multi(50, 50); 
		 int n4 = nums.div(40, 50);
		 double n5 = nums.pow(40,20);
		 
		 
		 System.out.println(n1 + "|" + n2 + "|" + n3 + "|" + n4 + "|" + n5);
	}
	
}

