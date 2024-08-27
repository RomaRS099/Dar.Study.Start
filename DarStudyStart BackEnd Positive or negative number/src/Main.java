import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = num.nextInt();
        if (a>0) {
            System.out.print("Число положительное");
        } else {
            System.out.print("Число отрицательное");
        }
    }
}