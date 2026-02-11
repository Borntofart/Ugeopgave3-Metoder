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
        System.out.println("Total er: " + assignmentPoints + examPoints + projectPoint);
    }

    void main () {
        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(30);

        printTotal();
    }
}
