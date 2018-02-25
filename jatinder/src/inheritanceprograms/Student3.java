package inheritanceprograms;

public class Student3 extends Student2 {
	int attendance;
	String Sport;
	Student3(int Id,String Name,String Std,int m1,int m2, int m3,int attendance, String Sport)
	{
		super( Id, Name, Std, m1, m2, m3);
		this.attendance=attendance;
		this.Sport=Sport;
	}
	double Result()
	{
		double Res = attendance+Sport+calculation();
		return Res;
	}
	void putdata()
	{
		display1();
		
		System.out.println("Marks1="+m1);
		System.out.println("Marks2="+m2);
		
		System.out.println("Marks3="+m3);
		
		System.out.println("Result is ="+res);
		
	
	}

}
