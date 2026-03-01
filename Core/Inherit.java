package Core;

class Calc{
	
	public int add(int r1 , int r2) {
		
		return r1 + r2;
	}
	
	public int sub(int r1 , int r2) {
		
		return r1 - r2;
	}
}

class Advcal extends Calc{
	
	public int multi(int r1 , int r2) {
		
		return r1 * r2;
	}
	
	public int div(int r1 , int r2) {
		
		return r1 % r2;
	}
}

public class Inherit {

	public static void main(String[] args) {
		
		Advcal num = new Advcal();
		
		int n1 = num.add(10, 20);
		int n2 = num.sub(20, 50);
		int n3 = num.multi(2, 5);
		int n4 = num.div(10, 40);
		
		System.out.print(n1 + "" + n2 + "" + n3 + "" + n4);
	}
	
}

