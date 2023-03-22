class Pattern9_1{
	public static void main(String args[]){
		for(char i='A'; i<='E';i++)
		{
			for(char j='E';j>=i-1;j--)
			{
				System.out.print(" ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
