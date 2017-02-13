
public class StudentSchedular {
	

	
private	Student[] stud=new Student[10];
	
private	int counterStudent;
	
	
	public String addStudent(int roll,String name){
		
		
		stud[counterStudent++] =new Student(roll,name);
		
		// students[counterStudent++] =new Student(rollNumber,name);
		
		
		
		return "Student added successfully";
				
	}
	
	void showStudents(){
		
		for(int i=0;i<counterStudent;i++){
			
			System.out.println(stud[i].getName());
			
			System.out.println(stud[i].getRollNumber());
			
			
			
		}
		
		
		
	}

	
	
}
