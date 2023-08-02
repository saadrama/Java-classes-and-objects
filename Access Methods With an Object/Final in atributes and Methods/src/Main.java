public class Main {
//    If you don't want to override the existing attribute values, declare attributes as final
    final int a=10;
    final double PI=3.142;
    public static void main(String[] args) {
        Main myObj=new Main();
        myObj.a=45;// will generate an error, cannot assign a value to a final variable
        myObj.PI=3.675;// will generate an error, cannot assign a value to a final variable
        System.out.println(myObj.a + myObj.PI);
    }
}