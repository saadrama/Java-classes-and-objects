public class Main {
    /*A constructor in java is a special method that is used to initialize objects.
    * The constructor is called when an object of a class is created.
    * It can be used to set initial values for object attributes*/
    int x;//class attribute
//    create a class constructor for the main class
    public Main(){
        x=5;// set the initial value for the class attribute x

    }
    public static void main(String[] args) {
        Main myObj=new Main();// create an object of class main (This will call the constructor)
        System.out.println(myObj.x);
        /*Note that the constructor name must much the class name, and it cannot have a
        * return type(like void). Also note that the constructor is called when the object is created */
    }
}