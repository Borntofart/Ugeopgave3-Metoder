//Opgave 4: Statistik-beregner
//Lav et program der analyserer et array af tal og beregner forskellige statistikker.
//
//Metoder der arbejder med arrays:
//
//calculateAverage(int[] numbers) - returnerer gennemsnittet
//findMax(int[] numbers) - returnerer det største tal
//findMin(int[] numbers) - returnerer det mindste tal
//countAboveAverage(int[] numbers) - returnerer antal tal over gennemsnittet
//I main:
//
//Opret et array med tallene: 45, 67, 23, 89, 34, 56, 78
//Beregn og udskriv gennemsnit, max og min
//Udskriv hvor mange tal der er over gennemsnittet
//Ekstra udfordring: Lav en metode printAllStats(int[] numbers) der kalder alle de andre metoder og præsenterer resultaterne pænt.


public class Opgave4 {
    int[] numbers = {45, 67, 23, 89, 34, 56, 78};

    int sum(int[] numbers) {
        int tottalen = 0;
        for (int i = 0; i < numbers.length; i++) {
            tottalen = tottalen + numbers[i];
        }
        return tottalen;
    }

    int count(int[] numbers) {
        return numbers.length;
    }

   double calculateAverage (int [] numbers) {
        return (double) sum(numbers) / count(numbers);
    }

    int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    int overAverage(int[] numbers) {
        int overAverageCount = 0;
        for (int num : numbers) {
            if (num >= calculateAverage(numbers)) {
                overAverageCount ++;
            }
        }
        return overAverageCount;
    }

    void main () {
        System.out.println("Gennemsnittet af arrayet er: " + calculateAverage( numbers));
        System.out.println("Dit max er: " + findMax(numbers));
        System.out.println("Dit min er: " +findMin(numbers));
        System.out.println("Der er: " + overAverage(numbers) + " Over gennemsnitet i arrayet");
    }
}
