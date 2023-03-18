package Comparable;
public class Emp implements Comparable<Emp>
{
    private String name;
    private String phone;
    private int empId;
    public int compareTo(Emp o){
        // As per name
        //return this.name.compareTo(o.name);

        return this.empId-o.empId;
    }
    public Emp(String name,String phone,int empId)
    {
        this.name=name;
        this.phone=phone;
        this.empId=empId;
    }
    public String getName()
    {
        return name;
    }
    public String getPhone()
    {
        return phone;
    }
    public int getempId()
    {
        return empId;
    }
    public String toString()
    {
        return "{"+name+","+phone+","+empId+"}";
    }
}