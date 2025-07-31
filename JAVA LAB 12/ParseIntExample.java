import java.util.Scanner;

public class ParseIntExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number as string: ");
        String input = sc.nextLine();  

        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (NullPointerException e) {
            System.out.println("Error: Null value entered!");
        }
    }
}
