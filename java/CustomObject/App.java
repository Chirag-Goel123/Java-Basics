package CustomObject;

import java.util.Comparator;
import java.util.*;
class NameComp implements Comparator<Worker>
{

	public int compare(Worker o1, Worker o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
class SalComp implements Comparator<Worker>
{
	public int compare(Worker o1,Worker o2)
	{
		return o1.salary-o2.salary;
	}
}
class Worker{
	String name;
	int salary;
	Worker(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return "["+this.name+"->"+this.salary+"].";
	}
}
class App
{
	public static void main(String[] args) {
		TreeMap<Worker,String> map=new TreeMap<Worker,String>(new SalComp());
		map.put(new Worker("Zazzy",1000),"ABC");
		map.put(new Worker("Abby",500),"DEF");
		map.put(new Worker("Daddy",10000),"GHI");
		
		for(Map.Entry<Worker, String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"-> "+entry.getValue());
		}
	}
}