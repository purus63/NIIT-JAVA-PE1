package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;

public class exe8 {

    public static void main(String[] args) {
        exe8 e8=new exe8();
        String[] string = e8.Exe8();

        for(String str : string)
            System.out.print(str);
    }
    public String[] Exe8(){
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc= new Scanner(System.in);

        while(true){

            int num1 = sc.nextInt();
            if(num1>=1 && num1<=100)
            {
                list.add("Number guessed matches original number");
                break;
            }
            else if(num1<1)
            {
                list.add("Number guessed less than original number");

            }
            else
            {
              list.add("Number guessed greater than original number");

            }

        }
        return list.toArray(new String[list.size()]);
    }
}
