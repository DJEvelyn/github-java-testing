import java.util.function.BiFunction;

public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Git Testing project has just started"); 

		createTestObjectList(); 
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
