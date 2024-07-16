import java.util.function.BiFunction;

public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Git Testing project has just started"); 

		TestObject testObject = new TestObject("One"); 
		
		
		createTestObjectList(); 
	}
	
	private static void adjustTestObject(TestObject given)
	{
		System.out.println("Adjusting test object " + given.getName() + "\n");
		
		System.out.println("Current value is " + given.getValue() + "\n"); 
		
		int changedValue = given.getValue() + 8; 
		
		System.out.println("Changed value is " + changedValue + "\n"); 
	}
	
	private static void createTestObjectList()
	{
		TestObject one = new TestObject("One");
		TestObject two = new TestObject("Two");
		TestObject three = new TestObject("Three");
		TestObjectHolder four = new TestObjectHolder("Four", one); 
		
		TestObjectGroup group = new TestObjectGroup();
		group.addTestObject(one);
		group.addTestObject(two);
		group.addTestObject(three);
		group.addTestObject(four);
		
		int count = 0; 
		
		BiFunction<Integer, TestObject, String> getString = (index, e) -> 
		{
			return e instanceof TestObjectHolder?
					"Element " + index + " is holding " + ((TestObjectHolder) e).getElement() 
					+ " and is " + e.getName() + "." : 
						"Element " + index + " is " + e.getName() + ".";
		}; 
		
		for (TestObject e : group.getTestObjectsList()) {
			++count; 
			
			System.out.println(getString.apply(count, e)); 
		}
		
		
	}
	
	

}
