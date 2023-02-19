import java.util.*;
import java.io.*;
import org.json.*;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to User Registration!");

        // Get user input
        System.out.print("Full Name: ");
        String fullName = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Mobile No.: ");
        String mobileNo = sc.nextLine();

        // Create JSON object
        JSONObject user = new JSONObject();
        user.put("fullName", fullName);
        user.put("email", email);
        user.put("password", password);
        user.put("address", address);
        user.put("mobileNo", mobileNo);

        // Write JSON object to file
        try (FileWriter file = new FileWriter("user.json")) {
            file.write(user.toString());
            System.out.println("User registration completed! Your information has been saved to user.json");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }
}
