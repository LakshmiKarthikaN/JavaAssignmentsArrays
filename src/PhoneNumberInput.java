import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your 10-digit phone number: ");
            long phoneNumber = scanner.nextLong();

            System.out.println("Phone number entered: " + phoneNumber);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only. Invalid phone number input.");
        }
    }
}
