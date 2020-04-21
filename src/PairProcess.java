import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2, product, sum;
        double avg;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
        sum = num1 + num2;
        product = num1 * num2;
        avg = sum / 2.0;

        if (sum > 200 && sum < 1000) {
            System.out.printf("The sum is: %d*~\n", sum);
        } else if (sum > 200) {
            System.out.printf("The sum is: %d*\n", sum);
        } else {
            System.out.printf("The sum is: %d.\n", sum);
        }
        System.out.printf("The product is %d.\n" +
                "The average is %.2f.", product, avg);
    }
}