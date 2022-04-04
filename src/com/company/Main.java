package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println();
        String hello="Hello World";
        System.out.println(hello);
        introduceYourself();
    }
    static void introduceYourself(){
        //Show my name
        String firstName= new String("Nikolina");
        String middleName= new String("Dimitrova");
        String lastName= new String("Mandicheva");
        System.out.println("My full name is: " + firstName + " " + middleName + " " + lastName);
    }

}
