package patternprograms;

import java.util.Scanner;

public class PatternB
{

	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter The no. of lines to print:");
		int n=sn.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
		sn.close();

	}

}
