package arrayprograms;

	import java.util.Scanner;

	public class Selectionpro {

		public static void main(String[] args) {
			Scanner sn=new Scanner(System.in);
			int temp;
			System.out.println("Enter the any number:");
			int m=sn.nextInt();
			int[] a=new int[m];
			
			System.out.println("Enter the unsorted array:");
			for(int i=0;i<a.length;i++)
				a[i]=sn.nextInt();
			
			System.out.println("Sorted numbers :");
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]+"\t");
			sn.close();

		}

	}


