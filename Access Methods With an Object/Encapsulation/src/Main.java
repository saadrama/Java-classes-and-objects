public class Main {
//    The work of encapsulation is to make sure sesitive data is hidden from users
    private String name;
    private int age;// private= restricted access
//getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public static void main(String[] args) {
        Main myObj= new Main();
        myObj.setName("Saad Ramah");//Set the value of the name variable to "saad"
        myObj.setAge(24);
        System.out.println(myObj.getName()+" "+myObj.getAge() +"years old, is a university student taking computer science, specializing in software engineering");
    }
}