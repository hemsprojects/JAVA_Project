package day6;

public class Main extends Thread{
		public void run() {
			//System.out.println("Hai Thread");
//			for(int i =1; i<=10; i++) {
//				System.out.println("Hai Thread "+i);
				System.out.println("Hai Thread ");
		}
		//}
			public void run1() {
				System.out.println("Hello Thread");
				
			}
}
class Excecute{
	public static void main(String[] args) {
			Main m = new Main();
			
			//m.run();
			m.run();
			m.run1();
	}
}


