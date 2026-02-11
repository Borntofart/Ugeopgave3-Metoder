//Lav et program der simulerer en simpel bankkonto med metoder til at indsætte og hæve penge.
//
//Globale variable:
//
//balance (double)
//accountName (String)
//Metoder du skal lave:
//
//deposit100() - indsætter 100 kr
//withdraw50() - hæver 50 kr
//printBalance() - udskriver saldo
//I main:
//
//Sæt accountName til dit navn
//Kald deposit100() to gange
//Kald withdraw50() én gang
//Udskriv saldoen
//



public class Opgave1 {
    double balance = 10000;
    String accountName = "Lucas' Bankkonto";
    //String accountName =;
    //Se note så først senere at man skulle navngive den I main

    void deposit100() {
        balance += 100;
    }

    void withdraw50() {
        balance -= 50;
    }

    void printBalance() {
        System.out.println("Der er: " + balance + "kr. på " + accountName );
    }

    void deposit200() {
        balance += 200;
    }

    void main(String[] args) {
        //Først her jeg opdaget man skulle lave navnet på den i main
        //accountName = "Lucas' Bankkonto"
        deposit100();
        deposit100();
        withdraw50();
        printBalance();

    }
}
