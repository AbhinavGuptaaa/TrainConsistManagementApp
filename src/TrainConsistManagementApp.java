import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class TrainConsistManagementApp {

    // UC1 + UC2
    static List<String> bogies = new ArrayList<>();

    // UC3
    static Set<String> bogieIds = new HashSet<>();

    // UC4
    static LinkedList<String> trainConsist = new LinkedList<>();

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

        // ---------------- UC4 ----------------
        manageTrainConsist();
        displayTrainConsist();
    }

    // ================= UC1 =================
    public static void displaySummary() {
        System.out.println("Initial Bogie Count: " + bogies.size());
    }

    // ================= UC2 =================
    public static void addBogies() {
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");
        System.out.println("\nBogies after adding: " + bogies);
    }

    public static void displayBogies() {
        System.out.println("Current Bogies: " + bogies);
    }

    public static void removeBogie(String bogie) {
        bogies.remove(bogie);
        System.out.println("After removing " + bogie + ": " + bogies);
    }

    public static void checkBogie(String bogie) {
        if (bogies.contains(bogie)) {
            System.out.println(bogie + " exists in the train.");
        } else {
            System.out.println(bogie + " does NOT exist.");
        }
    }

    // ================= UC3 =================
    public static void addBogieIds() {
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B1"); // duplicate ignored

        System.out.println("\nBogie IDs after adding (duplicates ignored): " + bogieIds);
    }

    public static void displayBogieIds() {
        System.out.println("Unique Bogie IDs: " + bogieIds);
    }

    // ================= UC4 =================
    public static void manageTrainConsist() {

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist: " + trainConsist);

        // Insert Pantry Car at position 2 (index 1)
        trainConsist.add(1, "Pantry Car");

        System.out.println("After adding Pantry Car: " + trainConsist);

        // Remove first and last
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After removing first and last bogie: " + trainConsist);
    }

    public static void displayTrainConsist() {
        System.out.println("Final Train Consist: " + trainConsist);
    }
}