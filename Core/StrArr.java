package Core;

class Students {
	
	int rollno;
	String name;
	int marks;
}

public class StrArr {

	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.rollno = 1;
		s1.name = "karthik";
		s1.marks = 80;
		
		Students s2 = new Students();
		s2.rollno = 1;
		s2.name = "Mano";
		s2.marks = 20;			//String arrays object
		
		Students s3 = new Students();
		s3.rollno = 1;
		s3.name = "Babu";
		s3.marks = 60;
		
		Students student[] = new Students[3];
		student[0] = s1;
		student[1] = s2;
		student[2] = s3;
		
		for(int i = 0; i < student.length; i++) {
			
			System.out.println(student[i].rollno + "" + student[i].name + "" + student[i].marks);
		}
		
		
	}
}
