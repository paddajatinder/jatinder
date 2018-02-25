package otherprograms;

	import java.util.Scanner;

	public class PrintPrime {

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the prime list number:");
			int val=s.nextInt();
			for(int i=1;i<val;i++) 
			{
				for(int j=2;j<i-1;j++)
				{
					if(i%j==0)
					{
						break;
					}
					else {
						System.out.println(i);
						//break;
					}
						
				}
				
			}
		}


}
