package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;

public class exe4{

    public static void main(String[] args) {
        exe4 e4=new exe4();
        String[] string = e4.Exe4();

        for(String str : string)
            System.out.print(str);
    }
    public String[] Exe4(){
        ArrayList<String> list = new ArrayList<String>();

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        if(num1>=1)
            list.add("1");

        for(int i=2;i<=num1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                list.add(" "+i);
            }
        }
       return list.toArray(new String[list.size()]);
    }
}
