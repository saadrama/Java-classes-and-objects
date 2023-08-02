/*create a car object named myCar. call the fullThrottle() and speed() metods on myCar object,
* and run the program*/
public class Main {
//    create a fullThrottle() metod
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can");
    }
//    create speed() method and add parameter
    public void speed(int maxSpeed, String spd){
        System.out.println("max speed is: "+ maxSpeed +spd);
    }
//    inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Main myCar=new Main();//create myCar object
        myCar.fullThrottle();
        myCar.speed(300,"kpH");
    }
}