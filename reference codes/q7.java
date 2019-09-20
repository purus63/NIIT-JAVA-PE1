package com.company;

import java.util.*;
import java.util.Scanner;
import java.util. Arrays;
import java.util.Collections;


public class q7 {

    public static void main(String[] args) {
        int flag=0;
        long num =0;
        while(true)
        {
            try
            {
                Scanner sc=new Scanner(System.in);
                num = sc.nextLong();
                flag=1;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Error "+ e);

            }
            if(flag==1)
                break;
        }
        int len=Long.toString(num).length();
       // System.out.println(len);
        Long [] arr =new Long[len];

        for(int i=len-1;i>=0;i--)
        {
            arr[i]=num%10;
            num=num/10;
        }
        Arrays.sort( arr, Collections.reverseOrder());

        long total=0,sum=0;
        for(int i=0;i<len;i++)
        {
            total=total*10+arr[i]%10;
            if(arr[i]%2==0)
            {
                sum+=arr[i];
            }
        }
        System.out.println("Sorted number in non-increasing order :" + total);
        System.out.println("Sum of even numbers :"+ sum);

        if(sum>15)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
            }

    }
}
