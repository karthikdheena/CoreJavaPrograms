package Core;

class students{
	
	int rollno;
	String name;
	
}

public class StrArr {

	public static void main(String[] args) {
		
		students obj =  new students();

		obj.name = "karthik";
		obj.rollno = 2;
		
		students obj1 =  new students();
		
		obj1.name = "tommy";
		obj1.rollno = 1;
		
		students stud[] = new students[2];
		
		stud[0] = obj;
		stud[1] = obj1;
		
	for(students str : stud){
		
		System.out.println(str.rollno + ":" + str.name);
		
		}

		
	}
}
