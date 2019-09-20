package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class exe6 {

    public static void main(String[] args) {

        exe6 e6=new exe6();
        String[] string = e6.Exe6();

        for(String str : string)
            System.out.print(str);
    }
    public String[] Exe6(){
        ArrayList<String> list = new ArrayList<String>();

        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);

        if(Pattern.matches("[a-z]",String.valueOf(c)))
        {
            list.add("Small letter");
        }
        if(Pattern.matches("[A-Z]",String.valueOf(c)))
        {
            list.add("Capital letter");
        }
        if(Pattern.matches("[0-9]",String.valueOf(c)))
        {
            list.add("Digit");
        }
        if(Pattern.matches("[^a-zA-Z0-9]",String.valueOf(c)))
        {
            list.add("Special character");
        }

        return list.toArray(new String[list.size()]);
    }
}
