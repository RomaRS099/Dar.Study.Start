import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner console = new Scanner(System.in);
System.out.print("Введите текст: ");
String text = console.nextLine();
String format = text.replace("a", "b");
System.out.print("Отредактированный текст: " + format);

    }
}