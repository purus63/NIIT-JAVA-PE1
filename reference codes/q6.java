package com.company;

import java.util.Scanner;
import java.util.regex.*;

public class q6 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);

        if(Pattern.matches("[a-z]",String.valueOf(c)))
        {
            System.out.println("Small letter");
        }
        if(Pattern.matches("[A-Z]",String.valueOf(c)))
        {
            System.out.println("Capital letter");
        }
        if(Pattern.matches("[0-9]",String.valueOf(c)))
        {
            System.out.println("Digit");
        }
        if(Pattern.matches("[^a-zA-Z0-9]",String.valueOf(c)))
        {
            System.out.println("Special character");
        }






    }
}
