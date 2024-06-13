package classesandobject;

import java.util.Date;

public class RefrenceType {

    public static void main(String[] args) {

        Date date;  //this is a reference type
        String name;

    date = new Date(); // this object created from class Date, where its reference from date, refrence can be assign by using new keyword
        name = "SASASASA";

        System.out.println(date.getDate()); // so using the reference variable we  can access the methods
        System.out.println(name.toLowerCase());

        //we can assign a null value to a reference types like the example below for reference type we dont have an issue to assign a null value to
        date = null;

        // but primitive data types would bring an error when we assign a null value to it
       //int value = null;   this throws an error while running this









    }


}
