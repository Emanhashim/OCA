package classesandobject;

public class Egg {

    private int number = 3;
    {
        number = 4;
    }

    public Egg(){
         number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.print(egg.number);
    }

    // the answer is 5 cause no matter the order is the constructor runs at last



}
