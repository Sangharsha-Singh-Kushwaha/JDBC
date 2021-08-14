package JDBC;

import java.sql.ResultSet;

public class kl {

	public static void main(String[] args) {
		System.out.println(Rec(6));
	}
	
	public static int Rec(int num) {
		
	if(num==2) return 2;
	if (num==1) return 1;
	return Rec(num-1)*Rec( num-2);
		
	}

}
