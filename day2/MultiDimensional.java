package day2;

public class MultiDimensional {
	public static void main(String[] args) {
		int[][] number= {{1,2,3},{10,20,30}};
		int n=2;
		//System.out.println(number[3]);
		for(int i=0;i<n;i++)
		{
			System.out.println(" ");
			for(int j=0;j<n;j++) 
			{
				System.out.print(" ");
				System.out.print(number[i][j]);
			}
		}
	}
}