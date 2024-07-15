
import java.util.*;
import java.util.stream.Collectors; 

public class TestObjectGroup 
{
	ArrayList<TestObject> testObjects;
	
	public TestObjectGroup() 
	{
		testObjects = new ArrayList<>();
	}
	
	public void addTestObject(TestObject given) 
	{
		testObjects.add(given);
	}
	
	public void removeTestObject(TestObject given)
	{
		testObjects.remove(given);
	}
	
	public ArrayList<TestObject> getTestObjectsList()
	{
		return GeneralMethods.cloneArrayList(testObjects); 
	}
	
}
