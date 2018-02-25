package inheritanceprograms;

public class Student1 {
	int Id;
	String Name;
	String Std;
     int x=100;
	Student1(int Id,String Name,String Std)
	{
		this.Id=Id;
		this.Name=Name;
		this.Std=Std;
	
	}
void display()

{
	System.out.println("Id ="+Id);
	System.out.println("Name ="+Name);
	System.out.println("Standard ="+Std);
	
}
}
