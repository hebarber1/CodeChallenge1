import java.util.Scanner;

public class codeChallenge1 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int userNum = 0;

        System.out.println("Enter a number.");
        userNum = scnr.nextInt();

        if (userNum % 15 == 0) {
            System.out.println("Your number is divisible by 15.");
        }

        if (userNum % 5 == 0) {
            System.out.println("Your number is divisible by 5.");

        }

        if (userNum % 3 == 0) {
            System.out.println("Your number is divisible by 3.");
        }
        scnr.close();
    }

}