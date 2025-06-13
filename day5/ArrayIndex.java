package day5;

import java.util.Scanner;

public class ArrayIndex {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try{
			System.out.println("Enter the number:");
			int num = in.nextInt();
			int total = 10 / num;
			System.out.println("Total:"+total);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
