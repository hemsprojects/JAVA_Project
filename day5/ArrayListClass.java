package day5;
import java.util.ArrayList;
public class ArrayListClass {

	public static void main(String[] args) {
		//int[] arr = new int[5];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList <Object> arr1 = new ArrayList<Object>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		//arr.forEach(num->System.out.println(num*num));
		
		arr.forEach(age->{
			if(age>=18) {
				System.out.println("Allowed");
			}
			else {
				System.out.println("Not allowed");
			}
		}
				);
		arr1.add("Hai Hello");
		System.out.println(arr);
		System.out.println(arr1);
	}

}
