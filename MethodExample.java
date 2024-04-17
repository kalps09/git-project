package Com.Javaprograms;

public class MethodExample {
	
	//normal method
	
	/*1) access specifier
	2) Return type
	3) Name for the method*/
	
	public void NormalMethod()
	{
		System.out.println("Void Method is printed");
		
	}
	
	
	//Second method - Method with return type
	
	/*1) access specifier
	2) Return type (Data type - int, float)
	3) Name for the method*/
	
	public int addtwoNumbers()
	{
		int a = 10;
		int b = 20;
		
		int c = a+b;
		
		System.out.println(c);
		return 9;

	}
	
	//Method with parameters
	
	public int addtwoValues(int a, int b)
	{
		int c = a+b;
		
		System.out.println(c);
		
		return c;
	}
	
	
	public static void main(String args[])
	{
		MethodExample obj1 = new MethodExample();
		
		obj1.NormalMethod();
		obj1.addtwoNumbers();
		
		obj1.addtwoValues(100, 200);
		
		
	}
	

}


