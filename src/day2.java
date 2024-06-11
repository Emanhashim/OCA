//import examples

import java.util.Random;// this is a package to get the random class its a package with different resources
// so import statement used to tell a compiler to find a class from a specific package e.g, we imported a random class from the package


public class day2 {
    public static void main(String args[]){

        Random r = new Random();  //this is an object to access this random class from the built in
        System.out.println(r.nextInt(10));// this will run any number from 0 to 10, keep running it shows different numbers between 0 to 10
    }


}


