package otherprograms;

	import java.util.Scanner;
	public class PalindromPro {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner sn= new Scanner(System.in);
			System.out.println("Enter the numbers you want to check:");
			int num=sn.nextInt(),z,rem=0,rev=0;
			z=num;
			while(num>0) {
				rem=num%10;
				num=num/10;
				rev=(rev*10)+rem;
						
			}
			if(z==rev)
				System.out.println("Number is palindrom");
			else
				System.out.println("Number is NOT palindrom");
		}

	}


