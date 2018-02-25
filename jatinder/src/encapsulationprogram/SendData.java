package encapsulationprogram;

public class SendData {

		public static void main(String[] args) {
			MyBean b=new MyBean();
			b.setId(1741);
			b.setName("Prabh");
			
			MyBean b1=new MyBean();
			b1.setId(1715);
			b1.setName("Jatinder");
			
			//reference is passed from one class to another class
			new GetData(b);
			new GetData(b1);
			

		}

}
