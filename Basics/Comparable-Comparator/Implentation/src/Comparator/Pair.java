package Comparator;

public class Pair {
    String name;
    String phoneNo;
    int empId;
    Pair(String name,String phoneNo,int empId)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.empId=empId;
    }
    public String toString()
    {
        return "{"+name+","+phoneNo+","+empId+"}";
    }
}
