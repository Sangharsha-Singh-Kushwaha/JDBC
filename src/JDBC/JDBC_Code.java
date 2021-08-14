package JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;



public class JDBC_Code {
	
	public static boolean insertStudentToDB(Student st) {

		boolean f =false;
		
		try {
			//jdbc code
			Connection connection=Connection_Provider.creatC();		

			String q="insert into students(sname, sphone, scity) value(?,?,?)";
			// Prepared Statement
			PreparedStatement pstmt=connection.prepareStatement(q);
			//set the value of parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setInt(2,st.getStudentPhone());
			pstmt.setString(3,st.getStudentCityString());
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int sid) {
		// TODO Auto-generated method stub
		
              boolean f =false;
		
		try {
			//jdbc code
			Connection connection=Connection_Provider.creatC();		

			String q="delete from students where sid=?";
			// Prepared Statement
			PreparedStatement pstmt=connection.prepareStatement(q);
			//set the value of parameters
			pstmt.setInt(1, sid);
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
		
	}

	public static void display_student() {
		// TODO Auto-generated method stub
		

        
	
	try {
		//jdbc code
		Connection connection=Connection_Provider.creatC();		

		String q="select * from students";
		// Create Statement
		Statement stmt=connection.createStatement();
		ResultSet result=stmt.executeQuery(q);
		while (result.next()) {
			System.out.println("Student id "+result.getInt(1));
			System.out.println("Student Name "+result.getString(2));
			System.out.println("Student Phone No "+result.getInt(3));
			System.out.println("Student City "+result.getString(4));
			System.out.println("=========================================");
			
		}
		
		
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

	public static boolean update_student() throws IOException {
		// TODO Auto-generated method stub
		
	     boolean f =false;
			
			try {
				//jdbc code
				Connection connection=Connection_Provider.creatC();		
				

				String q="update students set sname=?, sphone=?, scity=? where sid=? ";
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter new student name");
				String stname=br.readLine();
				System.out.println("Enter new phone no of student");
				int stphone=Integer.parseInt(br.readLine());
				System.out.println("Enter new city of student");
				String stcity=br.readLine();
				System.out.println("Enter student ID to update the record of student");
				int id=Integer.parseInt(br.readLine());
				
				// Prepared Statement
				PreparedStatement pstmt=connection.prepareStatement(q);
				
				//set the value of parameters
				
				pstmt.setString(1, stname);
				
				pstmt.setInt(2, stphone);
				
				pstmt.setString(3, stcity);
				
				pstmt.setInt(4, id);
				
				//execute
				pstmt.executeUpdate();
				f=true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return f;
			
	}

}
