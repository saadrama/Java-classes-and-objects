public class Second {
    public static void main(String[] args) {
//        create an object of the student class (Wich inherits attributes and methods from main)
        Student myObj=new Student();
        System.out.println("Name: "+myObj.fName);
        System.out.println("Age: "+myObj.age);
        System.out.println("Gradution Year: "+myObj.gradutionYear);
        myObj.study();//call abstract method
    }
}
