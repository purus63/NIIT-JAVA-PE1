package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;

public class exe10 {

    public static void main(String[] args) {
        exe10 e10=new exe10();
        String[] string = e10.Exe10();

        for(String str : string)
            System.out.print(str);
    }
    public String[] Exe10(){
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc =new Scanner(System.in);

        String str1= sc.nextLine();
        int num1 =sc.nextInt();

        int len=str1.length();
        list.add(str1);

        int temp=num1;
        String str2=str1.substring(len-num1,len);
        while (temp>0)
        {
            temp--;
        list.add(str2);
        }
    return list.toArray(new String[list.size()]);
    }
}
