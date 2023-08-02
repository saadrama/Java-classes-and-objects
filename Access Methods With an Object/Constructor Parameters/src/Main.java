public class Main {
    int x;
    int modelyear;
    String modelName;
    public Main(int y,int year,String name){
        x=y;
        modelyear=year;
        modelName=name;
    }
    public static void main(String[] args) {
        Main myObj=new Main(5,2000,"Voiis");
        System.out.println(myObj.x);//outputs 5
        System.out.println(myObj.modelName+" "+ myObj.modelyear);
    }
}