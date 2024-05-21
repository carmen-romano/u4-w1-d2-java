package Esercizio1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ESERCIZIO 1
        System.out.println("Inserisci una stringa");
        String testo = scan.nextLine();

        if (stringaPariDispari(testo)) {
            System.out.println("La lunghezza della stringa è pari.");
        } else {
            System.out.println("La lunghezza della stringa è dispari.");
        }
        //ESERCIZIO 2
        System.out.println("Inserisci un anno");
        int anno = scan.nextInt();
        scan.close();

        if (annoBisestile(anno)) {
            System.out.println(anno + " è un anno bisestile.");
        } else {
            System.out.println(anno + " non è un anno bisestile.");
        }
    }
    //-----------------ESERCIZIO 1--------------------------
    public static Boolean stringaPariDispari(String testo) {
        return testo.length() % 2 == 0;
    }
    //-----------------ESERCIZIO 2--------------------------
    public static Boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

