package RemoveNegFromList;
import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class App
{
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer> (Arrays.asList(1,24,-1,8,-3,0));
		List<Integer> myList = new CopyOnWriteArrayList<Integer>(numbers);
		for (Integer i: myList) 
		{
			if(i<0)
			{
				myList.remove(i);
			}
		}
		
		System.out.println(myList);
		
		// Using Java8 features
		System.out.println(numbers.stream().filter(i-> i>=0).collect(Collectors.toList()));
	}
}