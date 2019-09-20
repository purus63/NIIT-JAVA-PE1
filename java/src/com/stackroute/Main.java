package com.stackroute;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Choose a number to run the below file");
        System.out.println("1. exe1");
        System.out.println("2. exe2");
        System.out.println("3. exe3");
        System.out.println("4. exe4");
        System.out.println("5. exe5");
        System.out.println("6. exe6");
        System.out.println("7. exe7");
        System.out.println("8. exe8");
        System.out.println("9. exe9");
        System.out.println("10. exe10");

        int var1=0,flag=0;
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
                System.out.println("Choose File number again");
            }
            if(flag==1 )
            {
                if (var1 <= 10 && var1 >= 1)
                    break;
                else
                    continue;
            }
        }
        switch (var1)
        {
            case 1:
                System.out.println("Running Exe1 Palindrome check ");
                exe1.main(new String[]{});
                break;
            case 2:
                System.out.println("Running Exe2 Condition check ");
                exe2.main(new String[]{});
                break;
            case 3:
                System.out.println("Running Exe3 Vowel-Consonamt check ");
                exe3.main(new String[]{});
                break;
            case 4:
                System.out.println("Running Exe4 Looping number till nth iteration");
                exe4.main(new String[]{});
                break;
            case 5:
                System.out.println("Running Exe5 Sum unspecified number of arguement");
                exe5.main(new String[]{});
                break;
            case 6:
                System.out.println("Running Exe6 Character Checking");
                exe6.main(new String[]{});
                break;
            case 7:
                System.out.println("Running Exe7 Sorting number in non-increasing order");
                exe7.main(new String[]{});
                break;
            case 8:
                System.out.println("Running Exe8 Target-Range check");
                exe8.main(new String[]{});
                break;
            case 9:
                System.out.println("Running Exe9 reverse any string without using String Buffer");
                exe9.main(new String[]{});
                break;
            case 10:
                System.out.println("Running Exe10 Print last nth character of a string n time");
                exe10.main(new String[]{});
                break;
        }
    }
}
