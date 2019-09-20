package com.stackroute;

import java.util.*;
import java.util.Scanner;

public class exe2 {

    public String[] Exe2(int num1){

        ArrayList<String> list = new ArrayList<String>();

        if(num1%2==0 && (num1>20 && num1<30 ))
            list.add("Jerry");
        else if(num1%2==1 &&(num1>20 && num1<30))
            list.add("Tom");
        else
            list.add("Number out of Range");
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {

        int var1=0;
        int flag=0;
        while(true)
        {
            try
            {
                Scanner sc=new Scanner(System.in);
                var1 = sc.nextInt();
                flag=1;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Error "+ e);

            }
            if(flag==1)
                break;
        }


        exe2 e2=new exe2();
        String[] string = e2.Exe2(var1);

        for(String str : string)
            System.out.print(str);

    }

}

