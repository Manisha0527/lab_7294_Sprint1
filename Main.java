import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        ArmstrongNumber armstrong = new ArmstrongNumber(number);

        if (armstrong.isArmstrong()) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }
}

class ArmstrongNumber {
    private int number;

    public ArmstrongNumber(int number) {
        this.number = number;
    }

    public boolean isArmstrong() {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return result == number;
    }
}

