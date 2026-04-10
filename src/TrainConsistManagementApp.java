import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    // UC1 + UC2: List to store bogies
    static List<String> bogies = new ArrayList<>();

    // UC3: Set to store unique bogie IDs
    static Set<String> bogieIds = new HashSet<>();

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ---------------- UC1 ----------------
        displaySummary();

        // ---------------- UC2 ----------------
        addBogies();
        displayBogies();

        removeBogie("AC Chair");
        checkBogie("Sleeper");

        displayBogies();

        // ---------------- UC3 ----------------
        addBogieIds();
        displayBogieIds();
    }

    // ================= UC1 =================

    public static void displaySummary() {
        System.out.println("Initial Bogie Count: " + bogies.size());
    }

    // ================= UC2 =================

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

    // ================= UC3 =================

    // Add bogie IDs (duplicates ignored)
    public static void addBogieIds() {
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B1"); // duplicate

        System.out.println("\nBogie IDs after adding (duplicates ignored): " + bogieIds);
    }

    // Display unique bogie IDs
    public static void displayBogieIds() {
        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}