package day6;

public class Sample {
	public void display(int num) {
		for(int i=num;i<=10;i++) {
			System.out.println("The numbers:"+i);
		}
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		Sample in = new Sample();
		s.display(1);
		in.display(5);
	}

}
