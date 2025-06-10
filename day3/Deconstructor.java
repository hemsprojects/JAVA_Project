package day3;

public class Deconstructor {
	String name;
	int year;
	String lang;
	//parameterized constructor
	Deconstructor(String name,int year,String lang){
		this.name=name;
		this.year=year;
		this.lang=lang;
	}
	//copy constructor
	Deconstructor(Deconstructor copy){
		this.name=copy.name;
		this.year=copy.year;
		this.lang=copy.lang;
	}
	void display() {
		System.out.println("Deconstructor" + " "+name+" "+year+" "+lang);
	}
	
	public static void main(String[] args) {
		Deconstructor ref=new Deconstructor("java",1995,"pro");
		ref.display();
		System.out.println("Copied constructor");
		Deconstructor ref2=new Deconstructor(ref);
		ref2.display();
	}

}
