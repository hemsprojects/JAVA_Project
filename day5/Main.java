package day5;

import java.io.*;
public class Main {

	public static void main(String[] args) {
		String filename="D:\\Program Files\\Oops Concepts.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
		String Line;
				if((Line = br.readLine())!=null) {
					System.out.println(Line);
				}
	
	}
	catch(Exception e) {
		System.out.println("File not Found");
	}

}
}
