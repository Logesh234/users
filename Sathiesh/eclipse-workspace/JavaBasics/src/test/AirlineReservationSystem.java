package test;

import java.sql.*;
import java.util.Scanner;
 
class AirlineReservationSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/airline";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        try {
            // Establish a connection to the MySQL database
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // Create database tables if necessary
            createTables(connection);

            // Scanner for user input
            Scanner scanner = new Scanner(System.in);

            //boolean exit = false;
            String ch="YES";
            while ( ! ch.toUpperCase().equals("NO")) {
                // Display the menu
                System.out.println("****** Airline Reservation System ******");
                System.out.println("1. User Registration");
                System.out.println("2. User Login");
                System.out.println("3. Make Reservation");
                System.out.println("4. Cancel Reservation");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (option) {
                    case 1:
                        // User Registration
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter your contact details: ");
                        String contactDetails = scanner.nextLine();
                        System.out.print("Enter your email address: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter your username: ");
                        String username1 = scanner.nextLine();
                        System.out.print("Enter your password: ");
                        String password1 = scanner.nextLine();
                        registerUser(connection, name, contactDetails, email,username1,password1);
                        break;

                    case 2:
                        // User Login
                        System.out.print("Enter your username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter your password: ");
                        String password = scanner.nextLine();
                        if (validateUser(connection, username, password)) {
                            System.out.println("Login successful!");
                        } else {
                            System.out.println("Invalid username or password. Please try again.");
                        }
                        break;

                    case 3:
                        // Reservation
                        System.out.print("Enter origin: ");
                        String origin = scanner.nextLine();
                        System.out.print("Enter destination: ");
                        String destination = scanner.nextLine();
                        System.out.print("Enter date of travel: ");
                        String date = scanner.nextLine();
                        System.out.print("Enter number of passengers: ");
                        int passengers = scanner.nextInt();
                        makeReservation(connection, origin, destination, date, passengers);
                        break;

                    case 4:
                        // Cancellation
                        System.out.print("Enter reservation ID to cancel: ");
                        int reservationId = scanner.nextInt();
                        cancelReservation(connection, reservationId);
                        break;

                    case 5:
                        // Exit
                    	System.out.println("\nexit!!....");
            			System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option. Please choose again.");
                        break;
                }
                System.out.println("\n\nDo you want to continue: ");
                System.out.println("\nSay 'yes' or 'no'");
        		ch = scanner.next();
                System.out.println();
            }

            // Close the database connection
            connection.close();
            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}