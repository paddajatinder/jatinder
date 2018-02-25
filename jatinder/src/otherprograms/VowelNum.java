package otherprograms;

	import java.util.Scanner;

	public class VowelNum
	{

		public static void main(String[] args)
		{
			@SuppressWarnings("resource")
			Scanner sn= new Scanner(System.in);
			System.out.println("Enter any character:");
			char c=sn.next().charAt(0);
			
			switch(c) {
				case 'a':
					System.out.println("a is vowel");
					break;
				case 'e':
					System.out.println("e is vowel");
					break;
				case 'i':
					System.out.println("i is vowel");
					break;
				case 'o':
					System.out.println("o is vowel");
					break;
				case 'u':
					System.out.println("u is vowel");
					break;
				default:
					System.out.println("Character is consonant");
				}
		}

}
