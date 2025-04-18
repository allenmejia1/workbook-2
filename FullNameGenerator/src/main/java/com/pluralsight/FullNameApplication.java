package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");


        System.out.println("First name: ");
        String firstname = scanner.nextLine().trim();

        System.out.println("Middle name: ");
        String middlename = scanner.nextLine().trim();

        System.out.println("Last name ");
        String lastname = scanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();

        //compute the unknown
        String fullname = "";
        if (middlename.isBlank()){
            fullname = firstname + " " + lastname;
        }
        else{
            fullname = firstname + " " + lastname;
            fullname =String.format("%s %s %s", firstname, middlename, lastname);
        }

        if(!suffix.isBlank()){
            fullname += ", " + suffix;
        }

        System.out.println("Full name: " + fullname);

    }

}
