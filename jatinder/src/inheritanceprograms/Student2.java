package inheritanceprograms;

public class Student2 extends Student1 {
	
	int m1,m2,m3;
	public Student2(int Id,String Name,String Std,int m1,int m2, int m3)
	{
	super(Id,Name,Std);
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	}
	void display1()
	{
	System.out.println("marks m1="+m1);	
	System.out.println("marks m2="+m2);
	System.out.println("marks m3="+m3);
	}
	double calculation()
	
	{
		double avrg=(m1+m2+m3/3)*100;
		return avrg;
		
	}

}
