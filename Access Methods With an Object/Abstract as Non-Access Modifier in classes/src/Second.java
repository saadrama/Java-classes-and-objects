public class Second {
    public static void main(String[] args) {
//        create an object of the student class (which inherits attributes and methods from Main)
Student myObj=new Student();
        System.out.println("Name: "+myObj.firstName+" "+myObj.lastName);
        System.out.println("Email: "+myObj.email);
        System.out.println("Age: "+myObj.age);
        System.out.println("Admission Year: "+myObj.admissionYear);
        myObj.study();
    }
}
