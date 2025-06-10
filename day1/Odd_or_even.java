package day1;
import java.util.*;
public class Odd_or_even {
public static void main(String[] args)
{
	System.out.println("Enter start no:");
	Scanner in=new Scanner(System.in);
	int s=in.nextInt();
	System.out.println("Enter end no:");
	int e=in.nextInt();
	for(int i=s;i<=e;i++)
	{
		if(i%2==0)
		{
			System.out.println("Even numbers:"+i);
		}
		else 
		{
			System.out.println("Odd numbers:"+i);
		}
	}
}}
	