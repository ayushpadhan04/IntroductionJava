import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}
