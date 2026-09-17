import java.util.Arrays;

public class Opgave4 {
    int[] numbers = {45, 67, 23, 89, 34, 56, 78};

    void main() {
        System.out.println("Numbers:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("-------------");
        System.out.println("Average:");
        System.out.println(calculateAverage(numbers));
        System.out.println("-------------");
        System.out.println("Amount of numbers above average:");
        System.out.println(countAboveAverage(numbers));
        System.out.println("-------------");
        System.out.println("Biggest number:");
        System.out.println(findMax(numbers));
        System.out.println("-------------");
        System.out.println("Smallest number");
        System.out.println(findMin(numbers));
    }

    public int calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public int findMax(int[] numbers) {
        int biggest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }
        return biggest;
    }

    public int findMin(int[] numbers) {
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public int countAboveAverage(int[] numbers) {
        int average = calculateAverage(numbers);

        int count = 0;
        for (int num : numbers) {
            if (num > average) {
                count++;
            }
        }

        return count;
    }
}
