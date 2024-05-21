package Esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int numero = scan.nextInt();

        switch (numero) {
            case 0: {
                System.out.println("Zero");
                break;
            }
            case 1: {
                System.out.println("Uno");
                break;
            }
            case 2: {
                System.out.println("Due");
                break;
            }
            case 3: {
                System.out.println("Tre");
                break;
            }
            default: {
                System.out.println("Non hai inserito un numero valido");
                break;
            }
        }


        scan.close();
    }
}

