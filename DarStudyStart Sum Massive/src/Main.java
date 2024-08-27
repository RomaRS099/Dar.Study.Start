import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            sum = sum + array[i];
        }
        System.out.print("Сумма всего массива: " + sum);

    }
}