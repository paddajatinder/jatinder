package otherprograms;

	import java.util.Scanner;

	public class FactorialPro 
	{

		public static void main(String[] args)
		{
			@SuppressWarnings("resource")
			Scanner sn= new Scanner(System.in);
			System.out.println("Enter The Number:");
			int num=sn.nextInt(),fact=1;
			while(num>0)
			{
				fact=fact*num;
				num--;
			}
			System.out.println("Factorial is:"+fact);
		}
	}


