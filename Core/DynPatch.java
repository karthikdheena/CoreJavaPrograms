package Core;

class A {
	
	public void show() {
		
		System.out.println("hello A");
	}
	
}
class B extends A {
	
	public void show() {
		
		System.out.println("hello B");
	}
	
}
class C extends B {
	
	public void show() {
		
		System.out.println("hello C");
	}
	
}



public class DynPatch {

	public static void main(String[] args) {
		
		A obj = new A();
		
		obj.show();
		
		obj = new B();
									//	Dynamic Dispatch
		obj.show();
		
		obj = new C();
		
		obj.show();
	

	}

}
