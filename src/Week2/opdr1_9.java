package Week2;

import java.util.Scanner;

public class opdr1_9 {

    public static void main (String[]args) {
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 1.9");

        float getal;
        System.out.print("Vul een kommagetal in:");
        Scanner input = new Scanner(System.in);
        getal = Math.round(input.nextFloat());

        System.out.println("\nResultaat:\t"+getal);

    }
}
