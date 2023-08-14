import java.util.Scanner;

/*  Define n!! as
    n!! = 1 * 3 * 5 * ... * n if n is odd,
    n!! = 2 * 4 * 6 * ... * n if n is even.
    Hence 8!! = 2 * 4 * 6 * 8 = 384, there is no zero at the end. 30!! has 3 zeros at the end.
    For a positive integer n, please count how many zeros are there at the end of n!!.
    Example:
    30!! = 2 * 4 * 6 * 8 * 10 * ... * 22 * 24 * 26 * 28 * 30
    30!! = 42849873690624000 (3 zeros at the end)
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num;
        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Результат: " + calcTrailingZerosFactorial(num));
    }

    /*  Для нечетных нулей никогда не будет
        А для четных количество нулей будет равно количеству целых десяток в num
    */
    static int calcTrailingZerosFactorial (int num) {
        if (num % 2 == 0) {
            return num / 10;
        } else {
            return 0;
        }
    }
}