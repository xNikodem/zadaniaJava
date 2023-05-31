package Test2;

public class Zadanie3 {
    public static int getFibonacciIndex(int number) {
        if (number < 0) {
            return -1;
        }

        int prev = 0, current = 1, index = 0;
        while (current < number) {
            int temp = current;
            current += prev;
            prev = temp;
            index++;
        }

        return (current == number) ? index : -1;
    }

}
