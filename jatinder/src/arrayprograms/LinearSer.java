package arrayprograms;

  import java.util.Scanner;

	public class LinearSer
	{

		public static void main(String[] args)
		{
			Scanner jk=new Scanner(System.in);
			int loc=0;
			System.out.println("Enter any size of array:");
			int t=jk.nextInt();
			int[] a=new int[t];
			
			System.out.println("Enter the any Elements of array:");
			for(int i=0;i<a.length;i++)
				a[i]=jk.nextInt();
			
			System.out.println("Enter the any element to search:");
			int x=jk.nextInt();
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==x)
					loc = i;
				
			}
			if(loc==0)
				System.out.println("Element not found");
			else
				System.out.println("Element found at location:"+(loc+1));
			jk.close();

		}
	

}

	