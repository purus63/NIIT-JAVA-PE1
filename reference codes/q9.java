package com.company;

import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str =sc.nextLine();

        int len=str.length();
        String rev="";

        for(int i=0;i<len;i++)
        {
            rev=str.charAt(i)+rev;
        }
        System.out.println("The reverted string is " +rev);
    }
}
