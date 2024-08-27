import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = num.nextInt();
        System.out.print("Введите второе число: ");
        int b = num.nextInt();
System.out.println("Сумма чисел: " + (a+b));
System.out.println("Вычитание чисел: " + (a-b));
System.out.println("Умножение чисел: " + (a*b));
System.out.println("Деления чисел: " + (a/b));
System.out.println("Остаток от деления: " + (a%b));
    }
}