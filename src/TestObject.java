
public class TestObject implements Named
{
	
	private String name; 

	public TestObject(String name)
	{
		this.name = name; 
	}
	
	
	@Override
	public String getName() { return name; } 
	
}
