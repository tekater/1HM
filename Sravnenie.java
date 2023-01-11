import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
            int s = scanner.nextInt();
            int sum = 0; // сумма должна быть равна 0
		for (int a = 0; a < myArray.length; a++) {
            if (myArray[a] > s) {
                sum = sum + myArray[a];
            }
        }
		System.out.println(sum); // у меня получается на 1 больше чем в примере, я не понимаю как фиксить.
    }
}
