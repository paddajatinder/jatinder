package oopsprograms;

import java.util.Scanner;
        public class EmployeePro 
        {
		String emp_name,emp_bg;
		int emp_id,emp_in,emp_out;
		float emp_leba;
		long emp_salary;
		
		EmployeePro(String name,int id,String bg)
		{
			emp_name=name;
			emp_bg=bg;
			emp_id=id;
		}
		
		EmployeePro(long salary,int in,int out,float leba,String name,int id,String bg)
		{
			this(name,id,bg);
			emp_salary=salary;
			emp_in=in;
			emp_out=out;
			emp_leba=leba;
		}
		
		

		void showDetail()
		{
			System.out.println("Employee Details::");
			System.out.println("Id:            "+emp_id);
			System.out.println("Name:          "+emp_name);
			System.out.println("Blood Group:   "+emp_bg);
			//System.out.println("leave Balance: "+emp_leba);
		}
		
		
		void salary()
		{
			long one=emp_salary/28;
			int diff=emp_out-emp_in;
			if(emp_leba==0)
			{
				if(diff<4)
				{
					System.out.println("One Day Salary is Nil:");
					System.out.println("Remaining Leave Balance is:"+emp_leba);
				}
				else if(diff>=4 && diff<8)
				{
					System.out.println("The Day is counted as half day:");
					System.out.println("Remaining leave balance is:"+emp_leba);
				}
				else if(diff>=8)
				{
					System.out.println("Salary of one day is:"+one);
					System.out.println("Remaining Leave Balance is:"+emp_leba);
				}
			}
			else
			{
				if(diff<4)
				{
					emp_leba--;
					System.out.println("One Day Salary is:"+one);
					System.out.println("Remaining Leave Balance is:"+emp_leba);
				}
				else if(diff>4 && diff<8)
				{
					System.out.println("The Day is counted as half day:");
					System.out.println("Remaining leave balance is:"+(emp_leba-0.5));
				}
				else if(diff>=8)
				{
					System.out.println("Salary of one day is:"+one);
					System.out.println("Remaining Leave Balance is:"+emp_leba);
				}
			}
		}
		
		public static void main(String[] args) {
			EmployeePro a;
			Scanner s=new Scanner(System.in);
			String n,bg;
			int i_d,in,out;
			float lb;
			long sal;
			System.out.println("Enter the Employee Details");
			System.out.println("Name:");
			n=s.nextLine();
			System.out.println("Blood Group:");
			bg=s.nextLine();
			System.out.println("Id:");
			i_d=s.nextInt();
			System.out.println("In time in 24 hours:");
			in=s.nextInt();
			System.out.println("Out Time in 24 hours:");
			out=s.nextInt();
			System.out.println("Monthly Salary:");
			sal=s.nextLong();
			System.out.println("Leave Balance");
			lb=s.nextFloat();
			
			a= new EmployeePro(sal,in,out,lb,n,i_d,bg);
			a.showDetail();
			a.salary();
			s.close();
			
		}
		
	}


