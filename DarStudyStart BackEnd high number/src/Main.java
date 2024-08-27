import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = num.nextInt();
        System.out.print("Введите второе число: ");
        int b = num.nextInt();
        System.out.print("Введите третье число: ");
        int c = num.nextInt();
        int high = a;
        if (b > high) {
            high = b;
        }
        if (c > high) {
            high = c;
        }
        System.out.print("Наибольшее введённое число: " + high);
    }
}