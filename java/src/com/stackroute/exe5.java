package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;
public class exe5 {

    public static void main(String[] args) {
        exe5 e5=new exe5();
        String[] string = e5.Exe5();

        for(String str : string)
            System.out.print(str);
    }
    public String[] Exe5(){
        ArrayList<String> list = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        try {
            while (true) {
                System.out.println("Enter a number and enter to exit");
                String str1 = sc.nextLine();
                if (str1.length() == 0){
                    break;
                }else {
                    sum += Integer.parseInt(str1);
                }
            }
        }
        catch (NumberFormatException e)
        {
            list.add("Exception Occurs : "+e);
        }

        list.add("Sum equals " +sum);
        return list.toArray(new String[list.size()]);
    }
}