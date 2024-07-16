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
		TestObjectHolder<TestObject> four = new TestObjectHolder<>("Four", one); 
		
		TestObjectGroup group = new TestObjectGroup();
		group.addTestObject(one);
		group.addTestObject(two);
		group.addTestObject(three);
		group.addTestObject(four);
		
		int count = 0; 
		
		GeneralMethods.TriFunction<Integer, TestObject, Object, String> parseTestObject 
		= (index, e, object) -> 
		{
			String name = e.getName();
			
			return e instanceof TestObjectHolder?
					"Element " + index + " is holding " + object 
					+ " and is " + name + "." : 
						"Element " + index + " is " + name + ".";
		};
		
		for (TestObject e : group.getTestObjectsList()) {
			++count; 
			
			Object object = e instanceof TestObjectHolder? 
					((TestObjectHolder) e).getElement() : null;
			
			System.out.println(parseTestObject.apply(count, e, object)); 
		}
		
		
		
	}
	
	

}
