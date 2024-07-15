import java.util.ArrayList;
import java.util.stream.Collectors;

public class GeneralMethods 
{

	public static <T> ArrayList<T> cloneArrayList(ArrayList<T> given)
	{
		return given
				.stream()
				.collect(Collectors.toCollection(ArrayList::new)); 
	}
	
}
