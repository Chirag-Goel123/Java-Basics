package ComparableComparator;
import java.util.ArrayList;
import java.util.Collections;
class Student1
{
	String firstName;
	String lastName;
	int id;
	public Student1(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public String toString()
	{
		return "["+this.firstName+" "+this.lastName+" "+this.id+"]";
	}
	
}
class Comparator
{
	public static void main(String[] args) {
		ArrayList<Student1> list=new ArrayList<Student1>();
		list.add(new Student1("Chirag","Goel",1));
		list.add(new Student1("Tanya","Goel",2));
		list.add(new Student1("Sarita","Goel",3));
		list.add(new Student1("Rakesh","Goel",4));
		Collections.sort(list,new FirstName());
		System.out.println(list);
	}
}