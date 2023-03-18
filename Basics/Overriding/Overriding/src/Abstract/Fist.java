package Abstract;

abstract public class Fist {
    public void cal()
    {
        System.out.println("Caculating");
    }
    abstract public void launchRocket();
}

class Start{
    public static void main(String[] args) {
        Fist child=new Child();
        child.launchRocket();
    }
}
