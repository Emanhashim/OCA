package classesandobject;

public class Animal {

    String name;
    String species;

    public void sound(){
        System.out.println("this is a method from a class no return");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}
