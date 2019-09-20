package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {
        exe3 e3=new exe3();
        String[] string = e3.Exe3();

        for(String str : string)
            System.out.print(str);
    }
    public String[] Exe3(){

        ArrayList<String> list = new ArrayList<String>();


        Scanner sc= new Scanner(System.in);
        String str1= sc.nextLine();
        String s1= str1.toLowerCase();

        String Vo="vowel";
        String Co="Consonant";


        char[] chars = s1.toCharArray();

        if(chars[0] == 'a' || chars[0]=='e' || chars[0]=='i' || chars[0]=='o' || chars[0]=='u')
        {
            list.add(Vo + " ");
        }

        else if(Character.isLetter(chars[0]))
        {
            list.add(Co + " ");
        }
        else{
            list.add("Error ");
        }



        for(int i=1;i<s1.length();i++)
        {
            if(chars[i] == 'a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u')
            {
                list.add(" "+Vo);
            }

            else if(Character.isLetter(chars[i]))
            {
                list.add(" "+ Co);
            }
            else{
                list.add(" Error");
            }

        }

        return list.toArray(new String[list.size()]);
    }
}
