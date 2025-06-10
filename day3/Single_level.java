package day3;

public class Single_level {
	void Message() {
		System.out.println("Hem");
	}
}
	class subclass extends Single_level{
		void View() {
			System.out.println("Kumar");
		}
}
	class Main{
	public static void main(String[] args) {
	subclass ref=new subclass();
	ref.Message();
	ref.View();
	}
}