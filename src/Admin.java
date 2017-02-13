import java.util.Scanner;

public class Admin {
	
	
	static Scanner sc=new Scanner(System.in);
	
	private static StudentSchedular S1=new StudentSchedular();
	

	public static void main(String[] args) {
		
		int choice;
		
		
		showMenu();
	}
	
	//Scanner sc1=new Scanner(System.in);


	private static void showMenu() {
		
		
		int choice;
		
		while(true){
			
			
			System.out.println("1. add students");

			System.out.println("2.SHOW ALL students");
			
			System.out.println("3.exit");

		
			System.out.println("enter your choice");
				
			
			choice=sc.nextInt();
			
			switch(choice){
			
			
			
			case 1: savestudentdetails();
			break;
			
			
			case 2:showallstudentsdetails();
			break;
			
			case 3:System.exit(0);
			
			default : System.out.println("sorry you have entered qwrong deatils");
			
	}
			}
					
		
		}



	private static void savestudentdetails() {
		
		int rollNo;
		
		String name;
		
		System.out.println("please enter the roll no of student");
		
		rollNo=sc.nextInt();
		
		System.out.println("please enter the name of student");
		
		name=sc.next();
		
		
		
		System.out.println(S1.addStudent(rollNo, name));
	}
	
	private static void showallstudentsdetails() {
		// TODO Auto-generated method stub
		
		S1.showStudents();
		
	}

	/*private static void acceptstudentdetails() {
	
		S1.showStudents();
	}
		*/
		
		
	}
	
	
		
		
		
		
		



