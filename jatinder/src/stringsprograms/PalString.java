package stringsprograms;

	import java.util.Scanner;
	
	public class PalString {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter The String:");
			String sr=s.nextLine(),rev=" ";
			for(int i=sr.length()-1;i>=0;i--)
			{
				rev=rev+sr.charAt(i);
				
			}
			int x=0;  
			int y=sr.length()-1;
			     
			  while(y>=0){
			     if(sr.charAt(x)==rev.charAt(y)){
			          x++;
			          System.out.println(sr.charAt(x));
			         }
			            y--;
			  }
			  System.out.println("");
			
			
		}

}
