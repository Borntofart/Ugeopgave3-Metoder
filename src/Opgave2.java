//Opgave 2: Karakter-beregner
//Lav et program der holder styr på point fra forskellige afleveringer og beregner den samlede score.
//
//Globale variable:
//
//assignmentPoints (int)
//examPoints (int)
//projectPoints (int)
//Metoder med parametre:
//
//addAssignmentPoints(int points) - tilføjer point til assignment
//addExamPoints(int points) - tilføjer point til eksamen
//addProjectPoints(int points) - tilføjer point til projekt
//printTotal() - udskriver total score
//I main:
//
//Tilføj 25 assignment points
//Tilføj 40 exam points
//Tilføj 30 project points
//Udskriv totalen

import java.util.Scanner;

//Skal nok have lidt hjælp til hvordan opsætning med public classes skal være fedter rundt i det hahaha
public class Opgave2 {
    int assignmentPoints;
    int examPoints;
    int projectPoint;

    void addAssignmentPoints(int points) {
        assignmentPoints = assignmentPoints + points;
    }

    void addExamPoints(int points) {
        examPoints = examPoints + points;
    }

    void addProjectPoints(int points) {
        projectPoint = projectPoint + points;
    }

    void printTotal() {
        System.out.println("Total er: " + (assignmentPoints + examPoints + projectPoint));
    }


    void addPoints () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange points vil du tilføje?: " );
        int extraPoints = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hvilke slags points vil du tilføje?: ");
        String type = scanner.next();
        scanner.nextLine();
        switch (type){

            case "assignment":
                    assignmentPoints += extraPoints;
                    break;
            case "exampoints":
                    examPoints += extraPoints;
                    break;
            case "projectpoints":
                    projectPoint += extraPoints;
                    break;
            default:
                System.out.println("Cant be added or typo");
                addPoints();
                break;
        }

    }

    void main () {
        addAssignmentPoints(15);
        addExamPoints(25);
        addProjectPoints(15);

        addPoints();

        printTotal();
    }
}
