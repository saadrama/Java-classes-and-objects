public class Main {
    //The code is accessible in te same package and subclasses.
    protected String firstName = "jane";
    protected String lastName = "Njoki";
    protected String email = "jane@gmail.com";
    protected int age = 28;
}
class Student extends Main{
    private int admissionYear =2020;

    public static void main(String[] args) {
        Student myObj=new Student();
        System.out.println("Name: "+myObj.firstName+" "+ myObj.lastName);
        System.out.println("email: "+myObj.email);
        System.out.println("age: "+myObj.age);
    }
}