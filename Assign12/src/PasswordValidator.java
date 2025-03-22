import java.util.*;
import java.util.regex.*;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }

        int count = 0;

        if (password.matches(".*[a-z].*")) count++; 
        if (password.matches(".*[A-Z].*")) count++; 
        if (password.matches(".*[0-9].*")) count++; 
        if (password.matches(".*[~!@#$%^&*()\-=+_].*")) count++; 

        return count >= 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password to validate: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

        scanner.close();
    }
}
