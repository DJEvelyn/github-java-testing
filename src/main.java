
public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		TestObject testObject = new TestObject("One"); 
		
		
	}
	
	private static void adjustTestObject(TestObject given)
	{
		System.out.println("Adjusting test object " + given.getName() + "\n");
		
		System.out.println("Current value is " + given.getValue() + "\n"); 
		
		int changedValue = given.getValue() + 5; 
		
		System.out.println("Changed value is " + changedValue + "\n"); 
	}

}
