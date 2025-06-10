package day3;

public class Multi_Level {

	void add_to_cart(String category,int price) {
		System.out.println("Your category:"+category)
		;
		System.out.println("Item Price"+price)
		;
	}
	void add_to_cart(String category,int price,int quantity) {
		int total=price*quantity;
		System.out.println("total price:"+total);
	}
	public static void main(String[] args) {
	Multi_Level in=new Multi_Level();
	in.add_to_cart("Pant", 500);
	in.add_to_cart("Pant", 500, 10);
	}

}
