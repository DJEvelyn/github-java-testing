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
	
	public interface TriConsumer<T1, T2, T3>
	{
		public void apply(T1 a, T2 b, T3 c); 
	}
	
	public interface TriFunction<T1, T2, T3, T4>
	{
		public T4 apply(T1 a, T2 b, T3 c); 
	}
	
}
