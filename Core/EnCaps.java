package Core;

class Man{
	
	private int age;
	private String Name;
	
	public int getAge() {
		
		return age;
	}
	public void setAge(int a) {
		
		age = a;
	}
	public String  getName() {
		
		return Name;
	}
	
	public void setName(String n) {
		
		Name = n;		//encapsulation
	}

}
public class EnCaps {

	public static void main(String[] args) {
		
		Man obj = new Man();
		
		obj.setAge(21);
		obj.setName("Karthikdheena");
		
		System.out.println(obj.getAge() + ":" + obj.getName());
		

	}

}
