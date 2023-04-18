package EqualsAndHashCode;
import java.util.*;
class Student{
	String first;
	String last;
	String dob;
	String phone;
	public Student(String first, String last, String dob, String phone) {
		super();
		this.first = first;
		this.last = last;
		this.dob = dob;
		this.phone = phone;
	}
	public boolean equals(Object obj)
	{
		Student s=(Student)obj;
		if(s.phone.equals(this.phone))
		{
			return true;
		}
		return false;
	}
	public int hashCode()
	{
		return phone.hashCode();
	}
	public String toString()
	{
		return "'"+this.first+" "+this.last+" "+this.dob+" "+this.phone+"'";
	}
	
}
class App
{
	public static void main(String[] args) {
		Student s1=new Student("Chirag","Goel","6/20/1981","12345");
		Student s2=new Student("Chirag","Goel","6/20/1981","12345");
		Student s3=new Student("Tanya","Goel","6/10/1982","67891");
		Student s4=new Student("Tanya","Goel","6/10/1982","67891");
		HashSet<Student> set=new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set.size());
		List<Student> list=new ArrayList<Student>();
		for(Student s:set)
		{
			list.add(s);
		}
		System.out.println(list);
	}
}