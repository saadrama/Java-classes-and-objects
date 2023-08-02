final class Shoe {
//    The class cannot be inherited by other classes

    protected String brand = "Sports";

    public void hit() {
        System.out.println("Paaah, Paaah");
    }

}
class Main extends Shoe {
    private String modelName="Timberland";


    public static void main(String[] args) {
        Main myShoeType=new Main();
        System.out.println(myShoeType.brand+" "+myShoeType.modelName);
//        Outputs an error cannot inherit from final shoe class Main extends Shoe
    }
}