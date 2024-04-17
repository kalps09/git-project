package Com.Javaprograms;

public class VariablesExample {
	public static void main(String args[])
	{
		
		int a = 10;
	
		//Sytax - Class Name object name = new ClassName();
		
		VariablesExample obj1 = new VariablesExample();
		
		obj1.print();
		
		System.out.println(obj1.a);
		
		obj1.print1();
		
		System.out.println(obj1.globalvariable);
		
		
	}
//Global Variable Declaration
	int a = 10;
	
	int globalvariable = 20;
	
	public void print()
	{
		//local variable declaration
		int a =20;
		
		System.out.println("***Print Method***");
		System.out.println("Print Method");
		
		System.out.println("Local variable:" +a);
		
		System.out.println("Global variable:" +globalvariable);
	}
	
	public void print1()
	{
		System.out.println("Print 2");
	}

}
