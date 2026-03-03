package Core;

abstract class car{
	
	abstract public void drive();
	abstract public void drift();
	
	public void playmusic() {
		
		System.out.println("Playing");
	}
}
											//	abstraction 
class lamb extends car{
	
	public void drive() {
		
		System.out.println("driving");
	}


	public void drift() {
	
		System.out.println("drifting");
		
	}
}
 

public class Abstract {

	public static void main(String[] args) {
		
		car obj = new lamb();
		
		obj.drift();
		obj.drive();
		obj.playmusic();
		
		
		
		

	}

}
