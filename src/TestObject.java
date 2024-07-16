
public class TestObject implements Named
{
	
	private String name; 
	private Integer value; 

	public TestObject(String name)
	{
		this.name = name; 
		this.value = 0; 
		
		TestObjectManager.addTestObject(this);
	}

	
	@Override
	public String getName() { return name; } 
	
	public Integer getValue() { return value; }
	
	public void changeValue(VALUE_TYPE givenValueType, int amount)
	{
		amount = Math.abs(amount); 
		
		switch(givenValueType)
		{
			case INCREASE:
				value += amount;
				return;
			case DECREASE:
				value -= amount;
				return;
		}
	}
	
	@Override
	public String toString() { return getName(); } 
	
	
	public enum VALUE_TYPE
	{
		INCREASE,
		DECREASE
	}
}
