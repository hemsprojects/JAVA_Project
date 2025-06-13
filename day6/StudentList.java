package day6;
import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Object>arr = new ArrayList<Object>();
		//ArrayList<Integer> arr1 = new ArrayList<Integer>();
		System.out.println("-------------------------------------------------");
		arr.add("Name:Rahul");//
		arr.add("Mark:95");
		arr.add("Grade:A+");
		arr.add("Branch:Bsc CT");
		arr.add("Year Of Studing:3rd Year");
		arr.set(0,"Name:Karthik");
		//System.out.println(arr.get(1));
		//arr.remove(0);
		arr.add("------------------------------------------------");
		arr.add("Name:Robert");
		arr.add("Mark:80");
		arr.add("Grade:A");
		arr.add("Branch:Bsc CT");
		arr.add("Year Of Studing:3rd Year");
		arr.forEach(StudentList->System.out.println(StudentList));
		System.out.println("--------------------------------------------------");
		

	}

}
