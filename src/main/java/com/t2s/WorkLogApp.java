package com.t2s;

import java.io.*;
import java.util.*;

public class WorkLogApp {
    static final String FILENAME = "worklog.txt";
    static final List<String> DAYS = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");

    public static void main(String[] args) {
        WorkLogApp app = new WorkLogApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Log hours");
            System.out.println("2. View logged hours");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    app.logHours(scanner);
                    break;
                case 2:
                    app.viewLoggedHours();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    void logHours(Scanner scanner) {
        try (FileWriter fw = new FileWriter(FILENAME, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
            for (String day : DAYS) {
                System.out.print("Enter hours worked on " + day + ": ");
                double hours = scanner.nextDouble();
                out.println(day + ": " + hours);
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    void viewLoggedHours() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
