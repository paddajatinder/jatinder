package otherprograms;

import java.util.Scanner;

	public class EvenOdd {

		public static void main(String[] args)
		{
			@SuppressWarnings("resource")
			Scanner sn= new Scanner(System.in);
			System.out.println("Enter any number:");
			int a=sn.nextInt();
			if(a%2==0)
				System.out.println("Number is even");
			else
				System.out.println("Number is odd");
			
		}

	}


