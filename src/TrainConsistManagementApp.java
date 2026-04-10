import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    static List<String> bogies = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1
        displaySummary();

        // UC2
        addBogies();
        displayBogies();

        removeBogie("AC Chair");
        checkBogie("Sleeper");

        displayBogies();
    }

    // UC1 method
    public static void displaySummary() {
        System.out.println("Initial Bogie Count: " + bogies.size());
    }

    // UC2 methods

    // Add bogies
    public static void addBogies() {
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");
        System.out.println("\nBogies after adding: " + bogies);
    }

    // Display bogies
    public static void displayBogies() {
        System.out.println("Current Bogies: " + bogies);
    }

    // Remove bogie
    public static void removeBogie(String bogie) {
        bogies.remove(bogie);
        System.out.println("After removing " + bogie + ": " + bogies);
    }

    // Check existence
    public static void checkBogie(String bogie) {
        if (bogies.contains(bogie)) {
            System.out.println(bogie + " exists in the train.");
        } else {
            System.out.println(bogie + " does NOT exist.");
        }
    }
}