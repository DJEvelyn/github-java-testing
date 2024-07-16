import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestObjectManager 
{
	public static ArrayList<TestObject> heldList; 
	
	public static boolean initialized = false; 
	
	public static void addTestObject(TestObject given)
	{
		if (!initialized)
			initialize(); 
		
		heldList.add(given); 
	}
	
	public static void removeTestObject(TestObject given)
	{
		if (!initialized)
			initialize(); 
		
		heldList.remove(given); 
	}
	
	public static int getCount()
	{
		if (!initialized)
			initialize();
		
		return heldList.size(); 
	}
	
	public static ArrayList<TestObject> getList()
	{
		if (!initialized)
			initialize();
		
		return heldList.stream().collect(Collectors.toCollection(ArrayList::new)); 
	}
	
	private static void initialize()
	{
		heldList = new ArrayList<>(); 
		
		initialized = true; 
	}
	
}
