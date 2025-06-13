package day6;
import java.util.HashSet;
public class Studentemail {
	public static void main(String[]args) {
		HashSet<String> stuemail=new HashSet();
		stuemail.add("rdjmk@gmail.com");
		stuemail.add("karthik@gmail.com");
		
		for(String data:stuemail) {
			System.out.println(data);
		}
	}

}