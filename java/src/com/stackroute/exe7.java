package com.stackroute;

import java.util.*;
import java.util.Scanner;
import java.util. Arrays;
import java.util.Collections;


public class exe7 {

    public static void main(String[] args) {
        exe7 e7=new exe7();
        String[] string = e7.Exe7();

        for(String str : string)
            System.out.println(str);
    }
    public String[] Exe7(){
        ArrayList<String> list = new ArrayList<String>();
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
                list.add("Error "+ e);

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
        list.add("Sorted number in non-increasing order :" + total);
        list.add("Sum of even numbers :"+ sum);

        if(sum>15)
        {
            list.add("True");
        }
        else{
            list.add("False");
            }
    return list.toArray(new String[list.size()]);
    }
}
