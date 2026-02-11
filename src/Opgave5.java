//Opgave 5: Debug
//I scr folderen finder du en klasse kaldet DebugAssignment.
//
//Hvis du kører programmet får du en række fejl. Fix programmet så det kan køre.
//
//Outputtet bliver:
//7 is the smallest!
//
//OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer

/* Hvis du kører programmet får du en række fejl.
 * Fix programmet så det kan køre
 * outputtet bliver:
 * "7 is the smallest!"
 *
 *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
 */


void main() {

    int a = 7, b = 42;

    int smaller = minimum(a,b); //tilføjet int smaller prøvet først at lave den til en global værdi men det smadret det hele så tilføjer den også bare her

    if (smaller == a) { //Den er tarvelig hahahah har ændret til parenteser.

        System.out.println( smaller + " is the smallest!"); //den er også tarvelig den her hahaha ændret a til smaller

    }

}

int minimum(int a, int b) { //ændret til int fra void siden ellers tror jeg ikke den kan return noget

    int smaller; //tilføjet int smaller fordi ellers er den kun lokal
    if (a < b) {

        smaller = a; //brugte lang tid på at finde ud af man skulle fjerne int, men fjernet int for at den  gør det den skal

    } else{ //fjerner det hele (A >= B) den er jo ligegyldig for hvis a er mindre en b er den mindre hvis ikker er b selfølgelig den største

        smaller = b; //brugte lang tid på at finde ud af man skulle fjerne int.

    }

    return smaller; //fjernet int da den er blevet erklæret og bare skal return

}
