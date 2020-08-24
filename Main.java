/*
    Binary to Decimal converter.

    Simple programing exercise. Last edit 24/08/2020 | 05:09 | by s.

    -----------------------------------------------------------------
 */


import java.util.Scanner;

public class Main {

    //  converts binary to decimal (might want to replace var length with binaryNumber.length())
    static int bin2dec (String binaryNumber) {
        int length = binaryNumber.length();
        int decimalNumber = 0;

        for (int i = 0; i < length; i++) {
            decimalNumber += Character.getNumericValue(binaryNumber.charAt(i)) * Math.pow(2, length -1 -i);
        }
        return decimalNumber;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isBinaryCorrect = true;

        System.out.print("Please provide a binary number for conversion: ");
        String binaryNumber = scanner.nextLine();

        // check if entered digits are binary and set flag to false if they are not
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) != '1' && binaryNumber.charAt(i) != '0') {
                isBinaryCorrect = false;
                break;
            }
        }

        // check flag
        if (!isBinaryCorrect) {
            System.out.println("You can enter only binary digits (0 and 1).");
            return;
        }

        System.out.println( "The binary " + binaryNumber + " is equal to " + bin2dec(binaryNumber) + " decimal.");
    }
}
