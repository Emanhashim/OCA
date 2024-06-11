package classesandobject;

public class Swan {
    int numberEgg; // this is instance variable
    //static int vaa;
    public static void main(String[] args) {
        Swan mother = new Swan();

        mother.numberEgg = 60; // here we set the variable from the object

       // vaa = mother.numberEgg;
        System.out.println(mother.numberEgg); // reading the variable

    }
}
