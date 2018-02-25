package patternprograms;

	import java.util.Scanner;

	public class PatternD {

		public static void main(String[] args) {
			Scanner jk=new Scanner(System.in);
			System.out.println("Enter the no. of pattern lines:");
			int n=jk.nextInt();
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==j || i+j==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			jk.close();

		}


}
