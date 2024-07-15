
public class TestObjectHolder<T> extends TestObject
{
	private T elementHeld;
	
	public TestObjectHolder(String name, T element)
	{
		super(name); 
		
		this.elementHeld = element; 
	}
	
	public int getAmount()
	{
		return this.getValue(); 
	}
	
	public T getElement()
	{
		return elementHeld; 
	}

}
