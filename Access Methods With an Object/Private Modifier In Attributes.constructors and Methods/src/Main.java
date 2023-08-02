public class Main {
    //The code is only accessible within the declared class
    private String firstName="jane";
    private String lastName="Njoki";
    private   String email="jane@gmail.com";
    private int age=28;
    public static void main(String[] args) {
        Main myObj= new Main();
        System.out.println("Name: "+myObj.firstName+" "+ myObj.lastName);
        System.out.println("email: "+myObj.email);
        System.out.println("age: "+myObj.age);
    }
}