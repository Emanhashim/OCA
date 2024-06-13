package classesandobject;

public class InstanceAndClassVAr {

    static int MAX_LENGTH = 5;  // class variable, exist till the program ends
    int length; //this is instance variable, exist till the object exist

    public void grow(int inches){

        if(length < MAX_LENGTH){

            int newSize = length + inches;

            length = newSize;

        }
    }


    public static void main(String[] args) {
        InstanceAndClassVAr mouse = new InstanceAndClassVAr();

    }


}
