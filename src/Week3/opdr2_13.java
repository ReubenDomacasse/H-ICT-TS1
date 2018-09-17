package Week3;

import java.util.Scanner;

public class opdr2_13 {

    public static void main (String[]args){
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 2.13");

        Scanner input = new Scanner(System.in);

        for (int x = 0; x<=7; x++){
            for (int y = 0; y<=5; y++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<10; i += 2)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i=1; i<10; i += 2)
        {
            for (int k=0; k < (4 - i / 2); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
