package patternprograms;

	import java.util.Scanner;

	public class PatternC {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter The Number of lines to print:");
			int n=s.nextInt();
			
			for(int i=0;i<n;i++)
			{
				for(int k=0;k<=i;k++)
					System.out.print("*");
				for(int j=n;j>i;j--)
					System.out.print(" ");
				for(int k=0;k<=i;k++)
					System.out.print("*");
				System.out.println();
			}
			s.close();

		}


}
