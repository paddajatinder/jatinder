package stringsprograms;

import java.util.Arrays;
import java.util.Scanner;
	
	public class String1 
	{
	
		public static void main(String[] args)
		{
		
			Scanner s=new Scanner(System.in);
			boolean status=false;
			System.out.println("Enter the first string:");
			String s1=s.nextLine();
			System.out.println("Enter the second string:");
			String s2=s.nextLine();
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			if(s1.length()==s2.length())
			{
				Arrays.sort(c1);
				Arrays.sort(c2);
				status=Arrays.equals(c1, c2);
				
			}
			if(status==true)
				System.out.println("Strings Are anagram");
			else
				System.out.println("String is not anagram");
			}

}
