package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        //establish known values
        System.out.print("What is your full name? ");
       String name = scanner.nextLine().trim();



       //calculate the unknown
        int firstSpaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, firstSpaceIndex);

        int secondSpaceIndex = name.indexOf(" ", firstSpaceIndex + 1);

        String middleName = "";
        String lastName = "";

       if(secondSpaceIndex >= 0){
           //we have a middle and last name
           middleName = name.substring(firstSpaceIndex + secondSpaceIndex + 1);
           lastName = name.substring(firstSpaceIndex + secondSpaceIndex + 1);
       }
       else{
           //we only have last name
           middleName = "(none)";
           lastName = name.substring(firstSpaceIndex + 1);
       }



        //display the results
        System.out.println();
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}