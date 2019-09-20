package com.stackroute;


import java.util.*;
import java.util.Scanner;

public class exe1{

    public String[] Exe1(Long var1){

        ArrayList<String> list = new ArrayList<String>();

        String str1= Long.toString(var1);
        list.add("String str1 = " +str1);

        String reverse="";
        for(int i = str1. length() - 1; i >= 0; i--)
        {
            reverse = reverse + str1. charAt(i);
        }
        long sum=0;

        if(Objects.equals(str1, reverse))
        {
            while(var1>0)
            {
                long temp=var1%10;
                if(temp%2==0)
                    sum+=temp;
                var1/=10;
            }
            if(sum>=25)
            {
                list.add(str1 + " is palindrome the sum of even numbers is greater than 25");

            }
            else {
                list.add(str1 + " is palindrome the sum of even numbers is less than 25");

            }
        }
        else {
            list.add(str1 + " is not palindrome");
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main (String[] args){

        long var1=0;
        int flag=0;
        while(true)
        {
            try
            {
                Scanner sc=new Scanner(System.in);
                var1 = sc.nextLong();
                flag=1;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Error "+ e);

            }
            if(flag==1)
                break;
        }

        exe1 e1=new exe1();
        String[] string = e1.Exe1(var1);

        for(String str : string)
            System.out.println(str);

    }
}

