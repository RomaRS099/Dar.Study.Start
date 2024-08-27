import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] array = new int[10];
        Random random = new Random();
for (int i = 0; i<array.length; i++) {
array[i] = random.nextInt(50);
}
int max = Integer.MIN_VALUE;
int SecondMax = Integer.MIN_VALUE;
for(int i = 0; i< array.length; i++) {
    if (array[i]>max) {
       SecondMax=max;
       max=array[i];
    } else if (array[i]>SecondMax && array[i] != max) {
        SecondMax=array[i];
    }
}
System.out.print("Macсив: ");
for (int i =0; i<array.length; i++) {
    System.out.print(array[i] + " ");
}
System.out.println();
System.out.println("Второе по величине число в массиве: " + SecondMax);
    }
}