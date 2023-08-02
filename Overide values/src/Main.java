public class Main {
    final int x=15;//here we don't want the ability to override existing values, we declare the attribute as final
    int y=12;
    public static void main(String[] args) {
        Main myObj=new Main();
        myObj.y=18;
        System.out.println(myObj.x);
        System.out.println(myObj.y);//the value of y now is 18
        /*the final keyword is useful when you want a varriable to always store
        * the same value, like PI (3.142)
        * the final keyword is called a "modifier"*/
    }
}