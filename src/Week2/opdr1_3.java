package Week2;

import java.util.Scanner;

public class opdr1_3 {

    public static void main (String[]args) {
        uitwerkingen intro = new uitwerkingen();
        intro.startup("Opdracht 1.3");

        Scanner input = new Scanner(System.in);

        int getal1;
        int getal2;

        System.out.print("\nVul eerste getal in:\t");
        getal1 = input.nextInt();
        System.out.print("Vul tweede getal in:\t");
        getal2 = input.nextInt();

        System.out.println("De som van "+getal1+" en "+getal2+ "\t\t = "+(getal1+getal2));
        System.out.println("Het product van "+getal1+" en "+getal2+ " = "+(getal1*getal2));

    }
}
