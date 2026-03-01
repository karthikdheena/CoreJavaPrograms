package Core;
class Man{
	
	
	private int age;
	private String name;
	
	public int getAge() {
		
		return age;
	}
	public void setage(int a) {
		
		 age = a;
	}
public String getname() {
		
		return name;
	}
	public void setname(String n) {
		
		 name = n;
	}
	
}
public class EnCaps {

	public static void main(String[] args) {
		
		Man obj = new Man();
		
		obj.setage(21);
		obj.setname("karthik");
		
		System.out.println(obj.getAge() + ":" + obj.getname());
		
		
	
		

	}

}
