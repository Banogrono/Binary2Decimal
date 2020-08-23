import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please provide a binary number for conversion: ");
        String binaryNumber = scanner.nextLine();
        int decimalNumber = 0;

        int power = 0;
        for (int i = (binaryNumber.length() -1); i > 0; i--) {
            decimalNumber += Character.getNumericValue(binaryNumber.charAt(i)) * (int) Math.pow(2,power);
            power++;
        }
        
        System.out.println(decimalNumber);

    }
}
