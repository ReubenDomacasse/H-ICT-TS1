package Week2;

import java.util.Scanner;

public class opdr1_8 {

    public static void main (String[]args) {
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 1.8");

        double getal;
        System.out.print("Vul een kommagetal in:\t");
        Scanner input = new Scanner(System.in);
        getal = Math.round(input.nextDouble());

        System.out.println("\nResultaat:\t"+getal);

    }
}
