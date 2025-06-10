package day1;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		int b=1000;
	System.out.println("Insert ATM Card..!!");
	System.out.println("Enter your pin");
	Scanner in=new Scanner(System.in);
	int pin=in.nextInt();
	if(pin == 123)
	{
		System.out.println("Enter the Amt:");
		int a= in.nextInt();
		if(a<=b)
			{ 
				System.out.println("Collect your money");
			}
	else
	{
		System.out.println("Insufficient Balance");
	}
	
	}
	else {
		System.out.println("inavlid pin");
	}
	}

}
