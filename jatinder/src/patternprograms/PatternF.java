package patternprograms;

	import java.util.Scanner;

	public class PatternF {
		public static void main(String[] args)
		{
			Scanner jk=new Scanner(System.in);
			System.out.println("Enter the no. of lines:");
			int n=jk.nextInt();
			
			for(int i=0;i<n;i++)
			{
				for(int j=n;j>i;j--)
				{
					System.out.print(" ");
				}
				for(int k=0;k<=i;k++)
				{
					System.out.print(k+1);
				}
				for(int k=i-1;k>=0;k--)
				{
					System.out.print(k+1);
				}
				System.out.println();
				
			}
			jk.close();

		}


}
