package Com.Javaprograms;

public class SampleClass {
	public static void main(String args[])
	{
		
		MethodExample obj1 = new MethodExample();
		obj1.addtwoValues(500, 600);
		
		obj1.NormalMethod();
		
		StaticExample obj2 = new StaticExample();
		
		obj2.print();
		
		
		StaticExample.staticPrint();
	}

}
