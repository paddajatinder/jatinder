package otherprograms;

	import java.util.Scanner;

	public class Greatest3Num {

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sn= new Scanner(System.in);
			System.out.println("Enter any three numbers:");
			int a=sn.nextInt();
			int b=sn.nextInt();
			int c=sn.nextInt();
			
			if(a>b){
				if(a>c){
					System.out.println("Greatest is:"+a);
				}
				else {
					System.out.println("Greatest is:"+c);
				}
			}
			else {
				if(b>c){
					System.out.println("Greatest is:"+b);
				}
				else {
					System.out.println("Greatest is:"+c);
				}
			}
			if(a==b) {
				if(b==c) {
					System.out.println("A, B & C are equal");
				}
				else {
					System.out.println("A & B are equal");
				}
			}
			else if(b==c) {
				System.out.println("B & C are equal");
			}
			else if(a==c) {
				System.out.println("A & C are equal");
			}
			
		}


}
