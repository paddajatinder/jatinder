package oopsprograms;


	import java.util.Scanner;
	class Information 
	{
	
			int getdata(int m1,int m2,int m3)
			{
				int sum=m1+m2+m3;
				return sum;
			}
			
			void display(String name,String rn)
			{
				System.out.println("Roll No.:"+rn);
				System.out.println("Name    :"+name);
			}
			
			void percentage(int tot)
			{
				float per=((tot*100)/300);
				System.out.println("Percentage is:"+per);
			}
	}
	public class FunctionPro {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Name and Roll no.:");
			String name=s.nextLine();
			String rn=s.nextLine();
			System.out.println("Enter The Marks Of three Subjects:");
			int m1=s.nextInt();
			int m2=s.nextInt();
			int m3=s.nextInt();
			
			Information i=new Information();
			i.display(name, rn);
			int var=i.getdata(m1, m2, m3);
			i.percentage(var);
			s.close();

		}
}
