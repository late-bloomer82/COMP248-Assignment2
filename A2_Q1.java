import java.util.Scanner;

public class A2_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print title banner
        System.out.println("\\---------------------------------------------------------\\");
        System.out.println("/           Montreal Museum of Fine Arts Tickets          /");
        System.out.println("\\---------------------------------------------------------\\");

        // Prompt for age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if(age<5){
            System.out.println("Your ticket price is: Free");
        }

        else {

            // Prompt for museum membership
            System.out.print("Do you have a museum membership? (Yes/No): ");
            String isMember = scanner.nextLine().trim().toLowerCase();

            // If there is a member, inform that the ticket is free
            if (isMember.equals("yes")) {
                System.out.println("Your ticket price is: Free");
            } else {
                // Determine base ticket price
                int price = 0;
                if (age < 5) {
                    price = 0;
                } else if (age <= 17) {
                    price = 12;
                } else if (age <= 64) {
                    price = 30;
                } else {
                    price = 15;
                }

                // Ask for student status
                System.out.print("Are you a student? (Yes/No): ");
                String isStudent = scanner.nextLine().trim().toLowerCase();

                // Ask for veteran status
                System.out.print("Are you a veteran? (Yes/No): ");
                String isVeteran = scanner.nextLine().trim().toLowerCase();

                // Apply discounts
                if (isStudent.equals("yes")) {
                    price -= 5;
                }
                if (isVeteran.equals("yes")) {
                    price -= 7;
                }

                // Print corresponding ticket price
                System.out.println("Your ticket price is: " + "$" + price);
            }
        }

        // Blank line for formatting
        System.out.println();

        // Display complimentary message
        System.out.println("We hope you enjoy your visit to the Montreal Museum of Fine Arts!");

        // Close scanner for optimal resource usage.
        scanner.close();
    }
}
