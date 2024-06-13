package classesandobject;

public class VariableScope {
    public static void main(String[] args) {


        /*
        so as for the scoope variables inside a method block can be used inside the block
        out of the block or {} it didnt support to be used
        1, variables inside a method can only work on specific creadted block
        even its same method if its different block didnt work
        2, method parameters can be used to work on the entire block of the method
        below is the examle
         */


    }

    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;

        //there is two local variables here
        //1, piecesOfCheese this is a parameter method which works on the entire method
        //2, bitesOfCheese which only works inside the method block

    }

    // so the method local var, bitesofcheese only works inside its block of the method
    //as for the parameter it works inside the entire method

    public void eatIfHungry(boolean hungry) {


        if (hungry) {
          int   bitesOfCheese = 1;
        }

        //so this bitesOfCheese only works on inside if block only
        // the parameter hungry can be used on the entire method
        System.out.println(hungry);


        {
            boolean teenyBit = true;
            System.out.println(hungry);
        }

        // so again teenyBit can only be used inside its block only
        //but since hungry is a  parameter we can use it for the entire block


        {boolean yes = false;}
        //System.out.println(yes);
        }

        // this has  caused an error cause we r tyring to use the var out side the block



    }

