package com.company;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String str1= sc.nextLine();
        String s1= str1.toLowerCase();

        String Vo="vowel";
        String Co="Consonant";


        char[] chars = s1.toCharArray();

        if(chars[0] == 'a' || chars[0]=='e' || chars[0]=='i' || chars[0]=='o' || chars[0]=='u')
        {
            System.out.print(Vo + " ");
        }

        else if(Character.isLetter(chars[0]))
        {
            System.out.print(Co + " ");
        }
        else{
            System.out.print("Error ");
        }



        for(int i=1;i<s1.length();i++)
        {
            if(chars[i] == 'a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u')
            {
                System.out.print(" "+Vo);
            }

            else if(Character.isLetter(chars[i]))
            {
                System.out.print(" "+ Co);
            }
            else{
                System.out.print(" Error");
            }

        }



    }
}
