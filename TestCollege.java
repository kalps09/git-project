package Com.Javaprograms;

public class TestCollege {

	public static void main(String args[])
	{
		
		System.out.println(InterfaceCollege.collegename);
		
		InterfaceCollege CSE=new InterfaceExampleComputerscience();
		
		CSE.StudentDetails();
		CSE.StudentResults();
		
		
	InterfaceCollege ECS=new InterfaceExampleECS();
		
		ECS.StudentDetails();
		ECS.StudentResults();
		
	}
	
	
	
	
}
