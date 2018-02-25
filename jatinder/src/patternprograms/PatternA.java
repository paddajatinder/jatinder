package patternprograms;

	import java.util.Scanner;

	public class PatternA {

		public static void main(String[] args)
		{
			Scanner jk=new Scanner(System.in);
			System.out.println("Enter The number of lines:");
			int n=jk.nextInt();
			
			for(int i=0;i<n;i++)
			{
				for(int k=0;k<=i;k++)
				{
				
					System.out.print(i);
				}
				System.out.println();
			}
			
			jk.close();

		}
		int prime(int num)
		{
			int i, flag=0;
			
			for (i = 2; i < num; i++)
			{
				if (num % i != 0)
					flag = 1;
				else
				{
					flag = 0;
					break;
				}
			}
		 
			if (flag == 1 || num == 2)
				return 1;
			else
				return 0;
		}

	}



