package ImmutableClass;
import java.util.List;
import java.util.ArrayList;
final class Student
{
	private final String name;
	private final ArrayList<String> degrees;
	Student(String name,ArrayList<String> degrees)
	{
		this.name=name;
		ArrayList<String> temp=new ArrayList<>();
		for(String s:degrees)
		{
			temp.add(s);
		}
		this.degrees=temp;
	}
	public  String getName()
	{
		return this.name;
	}
	public  ArrayList<String> getDegrees()
	{
		ArrayList<String> temp=new ArrayList<>();
		for(String s:this.degrees)
		{
			temp.add(s);
		}
		return temp;
	}
}

class App
{
	public static void main(String[] args) {
		ArrayList<String> temp=new ArrayList<>();
		temp.add("ABC");
		temp.add("DEF");
		Student s=new Student("Chirag",temp); 
		System.out.println(s.getName());
		ArrayList<String> l2=s.getDegrees();
		l2.add("GHI");
		System.out.println(s.getDegrees());
	}
}