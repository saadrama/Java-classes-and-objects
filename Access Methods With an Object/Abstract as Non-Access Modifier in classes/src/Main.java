// abstract class
abstract class Main {
    //    The class cannot be used to create objects(To access an abstract class,it must be inherited from another class)
    public String firstName = "jane";
    public String lastName = "Njoki";
    public String email = "jane@gmail.com";
    public int age = 28;

    public abstract void study(); //abstract method

}
//   subclass (inherit from Main)
    class Student extends Main{
    public int admissionYear=2020;
    public void study(){
        System.out.println("Studying all day long");
    }

}