package arrayprograms;

	import java.util.Scanner;

	public class TwoDArray 
	{

		public static void main(String[] args)
		{
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter The Size of Array Matrix:");
			int m=sn.nextInt();
			int n=sn.nextInt();
			int[][] a=new int[m][n];
			
			System.out.println("Enter The Elements of Array Matrix");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
					a[i][j]=sn.nextInt();
			}
			
			System.out.println("The Matrix is:");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
					System.out.print(a[i][j]+"\t");
				System.out.println();
			}
			
			int small=a[0][0];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(small>a[i][j])
						small=a[i][j];
				}
			}
			System.out.println("Smallest Number is:"+small);
			sn.close();
		}
	}


