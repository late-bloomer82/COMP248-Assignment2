// --------------------------------------------------------------------
// Assignment 2
// Written by: Ahmad-Radjai Cherifi, 40327926
// For COMP 248 Section U – Winter 2025
// --------------------------------------------------------------------
// The Quebec Housing Rental Price Index Program calculates the rental price index base don the type and location of a property. The program prompts the user to enter the housing type and location. It then uses ratios to compute the rental price index using the formula. The final index value is displayed to the user.
import java.util.Scanner;

public class A2_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print title banner
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("           Welcome to Quebec Housing Rental Price Index Program          ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Blank line for format
        System.out.println();

        // Constant C
        final double C = 2.7593;

        // Prompt user to enter housing type and location
        System.out.print("Please enter a housing Type and Location, respectively: ");
        String input = scanner.nextLine().trim().toLowerCase();

        // Split the input into Type and Location and store into array
        String[] parts = input.split(" ");

        // Extract Type and Location from the parts array
        String type = parts[0];
        String location = parts[1];

        // Store variable to hold the R value
        double R = 0;

        // Switch to determine the ratio R based on Type and Location
        switch (type) {
            case "detached":
                switch (location) {
                    case "city":
                        R = 69.70;
                        break;
                    case "suburb":
                        R = 30.30;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the housing 'Location' variable. Please retry again!");
                        System.out.println();
                        System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                        return;
                }
                break;

            case "semidetached":
                switch (location) {
                    case "city":
                        R = 68.46;
                        break;
                    case "suburb":
                        R = 31.54;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the housing 'Location' variable. Please retry again!");
                        System.out.println();
                        System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                        return;
                }
                break;

            case "townhouse":
                switch (location) {
                    case "city":
                        R = 42.50;
                        break;
                    case "suburb":
                        R = 57.50;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the housing 'Location' variable. Please retry again!");
                        System.out.println();
                        System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                        return;
                }
                break;

            case "condo":
                switch (location) {
                    case "city":
                        R = 86.10;
                        break;
                    case "suburb":
                        R = 13.90;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the housing 'Location' variable. Please retry again!");
                        System.out.println();
                        System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                        return;
                }
                break;

            case "bungalow":
                switch (location) {
                    case "city":
                        R = 28.94;
                        break;
                    case "suburb":
                        R = 71.06;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the housing 'Location' variable. Please retry again!");
                        System.out.println();
                        System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                        return;
                }
                break;

            case "splitlevel":
                switch (location) {
                    case "city":
                        R = 35.89;
                        break;
                    case "suburb":
                        R = 64.11;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the housing 'Location' variable. Please retry again!");
                        System.out.println();
                        System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                        return;
                }
                break;

            case "duplex":
                switch (location) {
                    case "city":
                        R = 75.90;
                        break;
                    case "suburb":
                        R = 24.10;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the housing 'Location' variable. Please retry again!");
                        System.out.println();
                        System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                        return;
                }
                break;

            case "triplex":
                switch (location) {
                    case "city":
                        R = 76.80;
                        break;
                    case "suburb":
                        R = 23.20;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the housing 'Location' variable. Please retry again!");
                        System.out.println();
                        System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                        return;
                }
                break;

            case "fourplex":
                switch (location) {
                    case "city":
                        R = 85.40;
                        break;
                    case "suburb":
                        R = 14.60;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the housing 'Location' variable. Please retry again!");
                        System.out.println();
                        System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                        return;
                }
                break;

            default:
                System.out.println("Error: An invalid value has been entered for the housing 'Type' variable. Please retry again!");
                System.out.println();
                System.out.println("The value of the housing Rental Price Index, 'I', is: 0.00");
                System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");
                return;
        }

        // Calculate the rental price index I
        double I = (R * C) / 15;

        // Blank line for format
        System.out.println();

        // Display the result using printf
        System.out.printf("The value of the housing Rental Price Index, 'I', is: %.2f\n", I);

        // Display complimentary message
        System.out.println("Thank you for using Quebec Housing Rental Price Index Program!");

        // Close scanner for optimal resource usage.
        scanner.close();
    }
}
