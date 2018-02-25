package patternprograms;

	import java.util.Scanner;
	public class PatternE {
	
		public static void main(String[] args)
		{
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the no. of lines:");
			int n=sn.nextInt();
			
			for(int i=0;i<n;i++)
			{
				for(int j=n;j>i;j--)
				{
					System.out.print(" ");
				}
				for(int k=0;k<=i;k++)
				{
					int p=97+k;
					char c=(char)p;
					System.out.print(c);
				}
				for(int k=i-1;k>=0;k--)
				{
					int p=97+k;
					char c=(char)p;
					System.out.print(c);
				}
				System.out.println();
				
			}
			sn.close();

		}

}
