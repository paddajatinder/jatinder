package arrayprograms;

	import java.util.Scanner;

	public class sum
	{

		public static void main(String[] args)
		{
			int n,sum=0;
			System.out.println("Enter The size of array:");
			Scanner jr=new Scanner(System.in);
			n=jr.nextInt();
			int[] a=new int[n];
			System.out.println("Enter the array elements:");
			for(int i=0;i<n;i++)
			{
				a[i]=jr.nextInt();
				
			}
			
			for(int i=0;i<n;i++)
			{
				sum=sum+a[i];
			}
			System.out.println(sum);
			jr.close();
}
	}
	
