//abstract class
abstract class Main {
    //    An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass
    public String fName = "Jane";
    public int age = 24;

    public abstract void study();//abstract method

}
//   Subclass (inherit from Main)
    class Student extends Main{
    public int gradutionYear=2020;
    public void study(){ // The body of the abstract method is provided here
        System.out.println("Study all along");
    }
}

