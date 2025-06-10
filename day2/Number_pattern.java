package day2;

public class Number_pattern {

	public static void main(String[] args) {
		int[] number=new int[5];
		number[0]=1;
		number[1]=2;
		number[2]=3;
		number[3]=4;
		number[4]=5;
		int n=5;
		//System.out.println(number[3]);
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

}
