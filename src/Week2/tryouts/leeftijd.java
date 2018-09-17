package Week2.tryouts;

import java.util.Scanner;

public class leeftijd {

    public static void main (String[]args){
        int leeftijd;

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("");
            System.out.print("Vul je leeftijd in:\t");
            leeftijd = input.nextInt();
            if (leeftijd < 18){
                System.out.println("Nog geen biertje voor jou");
            }else {
                System.out.println("Wil je een biertje!!");
            }
        }
    }
}
