import java.util.Random;

public class number {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[5];

        System.out.println("Generated Random 3-digit Numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = rand.nextInt(900) + 100;  
            System.out.println(numbers[i]);
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nMinimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}
