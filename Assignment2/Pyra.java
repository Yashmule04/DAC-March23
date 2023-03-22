import java.util.Scanner;
class Pyra{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for Pyramid : ");
		int n = sc.nextInt();
		for(int i= 1 ; i<=n; i++)
		{
			for(int j= n-1 ; j>=i ; j--)
			{
					System.out.print(" ");
			}
			for(int l = 1 ; l<=i ; l++)
			{
					System.out.print("*");
					
			}
			for(int k= i-1 ; k>=1 ; k--)
			{
					System.out.print("*");
					
			}
			System.out.println();
		}
	}
}
		
		