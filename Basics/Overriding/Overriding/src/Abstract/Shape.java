package Abstract;
public interface Shape{
    int i=34;
    void calculateArea();
}
class Circle implements Shape
{
    public void calculateArea()
    {
        System.out.println("Area of circle is 5");
    }
    public static void main(String[] args) {
        Shape s1=new Circle();
        s1.calculateArea();
    }
}