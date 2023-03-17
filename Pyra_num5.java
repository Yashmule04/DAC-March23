import java.util.Scanner;
class Pyra_num5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for Pyramid : ");
		int n = sc.nextInt();
		for(int i =n; i>=1;i--)
		{
			for(int k =1;k<=i;k++)
			{
				System.out.print("  ");
			}
			for(int j =i ;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			for(int l =n-1;l>=i;l--)
			{
				System.out.print(l+" ");
			}
			
			System.out.println();
		}
	}
}
		
		