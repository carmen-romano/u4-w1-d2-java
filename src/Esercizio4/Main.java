package Esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int numero = scan.nextInt();
        for (int i = numero; i >= 0 ; i--) {
            System.out.println( i);

        }

    }
}