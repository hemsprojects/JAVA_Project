package Mysqlprograms;
import java.sql.*;

public class Task1 {

	public static void main(String[] args) throws Exception {

	String url = "jdbc:mysql://localhost:3306/mysql";

	String username = "root";

	String password = "karthi@kg";



	Connection connect = DriverManager.getConnection(url, username, password);

	System.out.println("Driver Loaded");



}

}