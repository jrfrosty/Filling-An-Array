// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        int[] numbers = new int[10];

        // Filling the array using a "classic" for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
