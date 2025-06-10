package day3;

public class Laptop {
		String name;
		int size;
		Laptop(String name, int size){
			this.name=name;
			this.size=size;
		}
		Laptop(Laptop copy){
			this.name=copy.name;
			this.size=copy.size;
		}
		void display() {
			System.out.println(name +" "+ size );
		}
		public static void main(String args[]) {
		Laptop ref=new Laptop("HP ENVY",6);	
		ref.display();
		System.out.println(" ");
		System.out.println("The copied constructor");
		System.out.println(" ");
		Laptop ref2=new Laptop(ref);	
		ref2.display();
		}
}
