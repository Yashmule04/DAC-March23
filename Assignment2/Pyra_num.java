import java.util.Scanner;
class Pyra_num{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for Pyramid : ");
		int n = sc.nextInt();
		for(int i= 1 ; i<=n; i++)
		{
			for(int j= n; j>=i ; j--)
			{
					System.out.print("  ");
			}
			for(int l = 1 ; l<=i ; l++)
			{
				
					System.out.print(l+" ");
					
			}
			for(int k= i-1 ; k>=1 ; k--)
			{
					System.out.print(k+" ");
					
			}
			System.out.println();
		}
	}
}
		
		