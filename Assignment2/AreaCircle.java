import java.util.Scanner;
public class AreaCircle{
	
	
	final float pi = 3.14f;
	void area(){
		System.out.println("Enter the radius of circle : ");
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		float ar = r*r*pi ;
		System.out.println("The are of circle is : "+ar);
	}
	void rect(){
		System.out.println("Enter the length and breadth fro area of rectangle : ");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("Area is : "+a*b);
	}
		
	public static void main(String args[]){
		int num ;
		AreaCircle Ar = new AreaCircle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for circle and 2 for rectangle : ");
		
		num = sc.nextInt();
		switch(num){
			case 1 : Ar.area();
			break;
			case 2 : Ar.rect();
			break;
			default:System.out.println("Invalid Input");
			break;
		}
	}
}
		
		
		
