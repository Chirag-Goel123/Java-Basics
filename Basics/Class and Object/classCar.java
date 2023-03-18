class Car
{
    static class CarDesign{
        // Data Members
        int modelNo;
        String carName;
        String carColour;

        public CarDesign()
        {
            this(96);   // Calling a different constructor from this constrcutor of same class.
            System.out.println("Creating object");
        }
        public CarDesign(int modelNo)
        {
            System.out.println("Car of model no "+modelNo +" is created");
        }
        // Function
        public void run()
        {
            System.out.println(carName+" is running");
        }
        public void light()
        {
            System.out.println(carName+" light is  on");
        }

    } 
    public static void main(String[] args)
    {
        System.out.println("Hello");
        CarDesign hyundai=new CarDesign();
        hyundai.carColour="White";
        hyundai.modelNo=23;
        hyundai.carName="santro";

        hyundai.run();
        hyundai.light();
    }
}
