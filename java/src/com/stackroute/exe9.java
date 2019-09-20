package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;

public class exe9 {

    public static void main(String[] args) {
        exe9 e9=new exe9();
        String[] string = e9.Exe9();

        for(String str : string)
            System.out.print(str);
    }
    public String[] Exe9(){
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc= new Scanner(System.in);
        String str =sc.nextLine();

        int len=str.length();
        String rev="";

        for(int i=0;i<len;i++)
        {
            rev=str.charAt(i)+rev;
        }
        list.add("The reverted string is " +rev);
        return list.toArray(new String[list.size()]);
    }
}
