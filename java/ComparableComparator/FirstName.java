package ComparableComparator;

import java.util.Comparator;

class FirstName implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.firstName.compareTo(o2.firstName);
	}
	
}