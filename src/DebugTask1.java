package src;

//Znajdz błąd

public class DebugTask1 {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int sum = calculateSum(numbers);
            System.out.println("Sum of the numbers: " + sum);
        }

        public static int calculateSum(int[] array) {
            int sum = 0;
            for (int i = 0; i <= array.length; i++) {
                sum += array[i];
            }
            return sum;
        }

}
