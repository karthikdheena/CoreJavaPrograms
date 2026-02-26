package Core;
class student{
	
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class ThisMeth {

	public static void main(String[] args) {
		
		student stud = new student();
		
		stud.setAge(20);
		stud.setName("Karthik");
		
		System.out.println(stud.getAge() + ":" + stud.getName());
		
	

	}

}
