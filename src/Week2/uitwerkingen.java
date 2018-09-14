package Week2;

import java.util.Scanner;

public class uitwerkingen {
    private static void split(){
        String split = "\n#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#";
        System.out.println(split);
    }

    void startup(String naam_opdracht){
        split();
        System.out.println(naam_opdracht+"\n"+"-------------------------------------------------------------");

        switch (naam_opdracht){
            case "Opdracht 1.1":
                System.out.println("Maak een programma waarmee \nje drie variabelen declareert \nvan het type String.\nDe eerste krijgt de waarde “Aap”, \nde tweede “Noot” en de derde “Mies”.\nToon als uitvoer de drie woorden, \neerst onder elkaar en vervolgens \nop één regel, gescheiden door spaties. \nGebruik hierbij \nde bovengenoemde variabelen.");
                break;
            case "Opdracht 1.2":
                System.out.println("Schrijf een programma \ndat de som van de getallen 1 t/m 10 berekent. \nToon als uitvoer de uitkomst.");
                break;
            case "Opdracht 1.3":
                System.out.println("Maak een programma \nwaarbij je twee gehele getallen \ndeclareert en initialiseert b.v. \nmet de waarden 4 en 12. \nZorg dat het programma de som en \nhet product toont van de beide getallen.");
                break;
            case "Opdracht 1.4":
                System.out.println("Lees een prijs in zonder btw. \nVan deze prijs wordt de btw (21%) bepaald. \nAfgedrukt wordt de prijs, \nde btw en de prijs + btw. \nGebruik als variabelen doubles.");
                break;
            case "Opdracht 1.5":
                System.out.println("Lees drie Double getallen in. Van deze getallen wordt de gemiddelde waarde berekend. \nAfgedrukt wordt de gemiddelde waarde. Let op: deling levert kommagetal!");
                break;
            case "Opdracht 1.6":
                System.out.println("Schrijf een programma \nwaarmee je een bedrag in euro’s \nkunt omrekenen in dollars. \nGebruik als variabelen doubles. \nLees het euro getal in en toon \nals uitvoer het dollar getal.");
                break;
            case "Opdracht 1.7":
                System.out.println("Lees een aantal seconden in. \nToon deze waarde als uren, \nminuten en seconden. \nDruk het netjes af.");
                break;
            case "Opdracht 1.8":
                System.out.println("Lees een kommagetal in. \nRond dit getal af volgens de normale regels. \nDruk het resultaat af.");
                break;
            case "Opdracht 1.9":
                System.out.println("Doe opdracht 1.9, \nmaar nu met 1 cijfer achter de komma.");
                break;
                default:
                    System.out.println(" ");
        }
        System.out.println("-------------------------------------------------------------");
    }

    private static void into(){
        System.out.println("HBO-ICT Huiswerkopdrachten Week 2\nAuthor:\t\tReuben Domacasse\nStud.no:\t15123804");
    }

    private static void keuzemenu(){
        into();
        Scanner input = new Scanner(System.in);
        while(true) {
            split();
            for (int x = 1; x < 10; x++) {
                System.out.println(x + " = Opdracht 1." + x);
            }
            System.out.println("Typ een getal in tussen 1-9 om opdracht uit te voeren");
            split();
            System.out.print("Typ \"S\" of STOP in om te stoppen\nWat ga je doen?\nJe besluit:\t");
            int keuze;
            try {
                keuze = input.nextInt();
            } catch (Exception e) {
                System.out.println("Dat was geen getal!\nHet process wordt gestopt!");
                break;
            }


            switch (keuze) {
                case 1:
                    opdr1_1.main(null);
                    break;
                case 2:
                    opdr1_2.main(null);
                    break;
                case 3:
                    opdr1_3.main(null);
                    break;
                case 4:
                    opdr1_4.main(null);
                    break;
                case 5:
                    opdr1_5.main(null);
                    break;
                case 6:
                    opdr1_6.main(null);
                    break;
                case 7:
                    opdr1_7.main(null);
                    break;
                case 8:
                    opdr1_8.main(null);
                    break;
                case 9:
                    opdr1_9.main(null);
                    break;
                default:
                    System.out.println("Dat is geen getal tussen 1-9!\n");
            }
        }

    }

    public static void main (String[]args){
        keuzemenu();
    }
}
