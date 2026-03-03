package Core;

final class Hello{	//	final class
	
	final int num = 10; // final variable
	
	
	final public void show() { 	//final method
		
	System.out.println("hello karthik");	
	}
	
	public void add(int r1 , int r2) {
		
	System.out.println(r1 + r2);
		
	}
}

//class Bye extends Hello { don't work 

//public void show()
	
//}

public class FinalKey {

	public static void main(String[] args) {
		
		Hello obj = new Hello();
		
		obj.show();
		obj.add(20, 40);
		
		
		
		
		

	}

}
