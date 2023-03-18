class AnimalDemo{
    public static class Animal{
        String colour="BLUE";
        int x=20;
        public  Animal()
        {
            System.out.println("Parent Constructor");
        }   
        public void eating()
        {
            System.out.println("Animal is Eating");
        }
    }
    public static class Dog extends Animal{
        public Dog()
        {
            super();
            System.out.println("Child class Constructor");
        }
        int x=5;
        public void speak()
        {
            System.out.println(this.x);
            System.out.println(super.x);
        }
    }
    public static void main(String[] args)
    {
        Dog d1=new Dog();
        d1.eating();
        d1.speak();
        System.out.println(d1.colour);
    }
}