public class Main {
    /*if you create multiple objects of one class, you can change the attribute values
    * in one object, without affecting the attribute values in the other:*/
    //change the value of x to 30 in myObj2, and leave x in myObj1 unchanged
    int x=10;
    public static void main(String[] args) {
        Main myObj1=new Main();
        Main myObj2=new Main();
        myObj2.x=30;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}