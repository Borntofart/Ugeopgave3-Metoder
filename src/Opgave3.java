//Lav et program til en webshop der beregner slutprisen på et produkt ved at anvende rabat og derefter moms.
//
//Metoder der returnerer værdier:
//
//applyDiscount(double price, double discountPercent) - returnerer pris efter rabat
//addTax(double price) - returnerer pris inkl. 25% moms
//calculateFinalPrice(double basePrice, double discount) - bruger de to andre metoder
//I main:
//
//Start med en basispris på 500 kr
//Anvend 20% rabat
//Tilføj moms
//Udskriv slutprisen


public class Opgave3 {
    double basisPrice = 500;
    double discountPercent = 20;

    //sad og prøvet at lave den her til en void i stabilt 15 min før jeg opdaget den self ik returner noget ;-;
    double applyDiscount(double basisPrice, double discountPercent) {
        basisPrice = basisPrice - (basisPrice * (discountPercent /100)) ;
        return basisPrice;
    }

    double addTax(double basisPrice){
        basisPrice = basisPrice * 1.25;
        return basisPrice;
    }

    double finalPriceAfter (double basisPrice, double discountPercent) {
        //applydiscount();
        //applydiscount();
        //forstår godt hvorfor jeg ikke for lov til det her ^ Men ville det ikke være mere effektivt at kalde dem i main
        //og så lave en variable der hedder finalPrice som bliver til dem?
        double finalPriceAfter = applyDiscount(basisPrice, discountPercent);
        double finalPrice = addTax(finalPriceAfter);
        return finalPrice;
    }

    void main () {
        double finalPrice = finalPriceAfter(basisPrice, discountPercent);
        System.out.println("Din endelig total er du skal betale er: " + finalPrice + "Kr.");

    }
}
