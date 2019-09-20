package com.company;


import java.util.*;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {


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
        String str1= Long.toString(var1);
        System.out.println("String str1 = " +str1);

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
                System.out.println(str1 + " is palindrome and the sum of even numbers is greater than 25");

            }
            else {
                System.out.println(str1 + " is palindrome the sum of even numbers is less than 25");

            }
        }
        else {
            System.out.println(str1 + " is not palindrome");
        }
    }
}

