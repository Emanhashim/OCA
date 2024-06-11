package classesandobject;

public class object {


    // crete a constructor, a special type of a class
    // no return value to be added
    // name of class and constructor does match
    // this helps to initialize values of a variable

    //example

   // int numEgg = 60; // this is direct initialize
//    String na; // here we just declared the variable but to initialize we can put it direct to constructor
    private String name = "fluffy";

    {
        System.out.println("setting the field");
    }

    public object(){

        name = "duke";  //here we have set the value to a new one
        System.out.println(" i am constructor");
//        na = "hayati"; // here we uses the constructor to initialize the value of the variable

    }

    //this is not a constructor since it has a return type even its void
//    public void object(){
//        System.out.println("constructor");
//    }

    public static void main(String[] args) {
        object ob = new object();
        System.out.print(ob.name);
    }


}
