package day6;
import java.util.HashMap;
import java.util.Map;

public class StudentMarks{

	public static void main(String[] args) {
		HashMap<String,Integer> studentmarks = new HashMap();
		studentmarks.put("john",95);
		studentmarks.put("Karthik",100);
		studentmarks.put("Robert", 90);
		int totalmarks = 0;
		for(int marks:studentmarks.values()) {
			totalmarks+=marks;
			
	}
	System.out.println(totalmarks);
	double average = totalmarks/studentmarks.size();
	System.out.println(average);
	for(Map.Entry<String,Integer> entry : studentmarks.entrySet()) {
	System.out.println(entry.getKey()+ " "+entry.getValue());
}
	}
	
}
