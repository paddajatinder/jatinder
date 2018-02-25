package otherprograms;

import java.util.Scanner;

	public class PrimeNum
	{

		@SuppressWarnings("unused")
		public static void main(String[] args)
		{
			@SuppressWarnings("resource")
			Scanner sn= new Scanner(System.in);
			System.out.println("Enter the number:");
			int a=sn.nextInt();
			if(a==0 || a==1)
				System.out.println("Number is Not prime number");
			else {
				for(int i=2;i<=a-1;i++)
				{
					if(a%i==0)
					{
						System.out.println("Number is not prime");
						break;
					}
					else
					{
						System.out.println("Number is  prime");
						break;
					}
				}
			}
		}


}
