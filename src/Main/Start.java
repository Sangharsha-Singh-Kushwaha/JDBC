package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import JDBC.JDBC_Code;
import JDBC.Student;

public class Start {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Student Management System");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to update student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to delete student");
			System.out.println("Press 5 to exist student management system");
			int input=Integer.parseInt(br.readLine());
			if(input==1) {
				//add student
				System.out.println("Enter student name");
				String name=br.readLine();
				System.out.println("Enter student phone number");
				int phone= Integer.parseInt(br.readLine());
				
				System.out.println("Enter student city");
				String city=br.readLine();
			
				
				// create student object to store student
				Student st=new Student(name, phone, city);
				boolean ans=JDBC_Code.insertStudentToDB(st);
				if(ans==true) {
					System.out.println("Student information added successfully");
					System.out.println();
				}else {
					System.out.println("Something went wrong try again");
				}
				System.out.println(st);
				System.out.println();
				
			}else if (input==2) {
				//update student information
				
				boolean ans=JDBC_Code.update_student();
				if (ans) {
					System.out.println("Student record update successfully");
				}else {
					System.out.println("Something went wrong");
				}
				
			}else if (input==3) {
				//display students informations
				JDBC_Code.display_student();
			}else if(input==4) {
				//delete student information
				
				System.out.println("Enter student ID to delete the student information");
				int sid=Integer.parseInt(br.readLine());
				boolean ans1=JDBC_Code.deleteStudent(sid);
				if(ans1) {
					System.out.println("Student record successfully deleted");
					
				}else {
					System.out.println("Something went wrong");
				}
				
			} else if (input==5) {
				//exist
				break;
			}else {
				
			}
			
		}
		System.out.println("Thankyou for using student management system");
		

	}

}
