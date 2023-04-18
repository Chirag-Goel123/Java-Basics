package ComparableComparator;
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>
{
	String firstName;
	String lastName;
	int id;
	public Student(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public int compareTo(Student o) {
		//return this.firstName.compareTo(o.firstName);
		return this.id-o.id;
	}
	
	public String toString()
	{
		return "["+this.firstName+" "+this.lastName+" "+this.id+"]";
	}
}
class App
{
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student("Chirag","Goel",1));
		list.add(new Student("Tanya","Goel",2));
		list.add(new Student("Sarita","Goel",3));
		list.add(new Student("Rakesh","Goel",4));
		Collections.sort(list);
		System.out.println(list);
	}
}