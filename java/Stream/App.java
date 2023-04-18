package Stream;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class App
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(-1);
		list.add(-5);
		list.add(-10);
		list.add(-50);
		list.add(50);
		
		System.out.println(list.stream().filter(i->i>=0).collect(Collectors.toList()));
	}
}