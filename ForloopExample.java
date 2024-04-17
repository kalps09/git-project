package Com.Javaprograms;

public class ForloopExample {

	public static void main(String args[])
	
	{
		
	//for(int i=1;i<=5;i++)
			{
				// System.out.println(i);
			}
	
	//System.out.println("come out from the loop");
	
	for(int i=8;i<=10;i++)
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("Child Nested For Loop"+j);
			
		}
		
		System.out.println("Parent Nested For Loop"+i);
	}
	
	//Nested For loop pyramid program
	
	for(int i=1;i<=5;i++)

	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("@");
		}
		
		System.out.println();

}
	
	//Enhanced For loop
	
			String TeamIndia[] = {"Dhoni", "Kohli","Yuvraj","Kaif"};
			
			for(String Name:TeamIndia)

						{
				System.out.println(Name);
			}
}

}
