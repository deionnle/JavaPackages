import java.util.Scanner;
import CubeNumber.Cube;
import SumNumbers.Sum;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        long n =  scanner.nextInt();
        System.out.println(n + " в кубе = " + Cube.cubenum(n));
        System.out.println("Сумма цифр " + Cube.cubenum(n) + " = " + Sum.sumnum(n));
    }
}
