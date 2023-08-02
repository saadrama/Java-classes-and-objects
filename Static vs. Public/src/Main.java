public class Main {
    /*Static method  means that it can be accessed without creating an object of the class, unlike public
    *, whic can only be accessed by objects*/
//    STATIC METHOD
    static void myStaticMethod(){
        System.out.println("Static methods can be called witout creating objects");
    }
//    PUBLIC METHOD
    public void myPublicMethod(){
        System.out.println("public methods must be called by creating objects");
    }
//    MAIN METHOD
    public static void main(String[] args) {
        myStaticMethod(); //call the static method
//        myPublicMethod(); This would compile an error
        Main myObj=new Main();// create an object of main
        myObj.myPublicMethod(); //call the public method on the object

    }
}