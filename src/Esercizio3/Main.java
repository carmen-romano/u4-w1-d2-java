package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String testo = "";
        String risultato = "";

        while (!testo.contains(":q")) {
            System.out.println("Inserisci una stringa:");
            testo = scan.nextLine();
            String[] caratteri = testo.split("");
            risultato = String.join(",", caratteri);
            System.out.println("Stringa con virgole: " + risultato);

        }

            scan.close();
    }
}