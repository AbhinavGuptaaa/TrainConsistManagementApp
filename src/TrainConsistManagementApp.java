import java.util.*;

public class TrainConsistManagementApp {

    static List<String> bogies = new ArrayList<>();
    static Set<String> bogieIds = new HashSet<>();
    static LinkedList<String> trainConsist = new LinkedList<>();
    static LinkedHashSet<String> trainFormation = new LinkedHashSet<>();
    static HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

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

        // UC3
        addBogieIds();
        displayBogieIds();

        // UC4
        manageTrainConsist();
        displayTrainConsist();

        // UC5
        manageTrainFormation();
        displayTrainFormation();

        // UC6
        manageBogieCapacity();
        displayBogieCapacity();
    }

    // UC1
    public static void displaySummary() {
        System.out.println("Initial Bogie Count: " + bogies.size());
    }

    // UC2
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

    // UC3
    public static void addBogieIds() {
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B1");
        System.out.println("\nBogie IDs: " + bogieIds);
    }

    public static void displayBogieIds() {
        System.out.println("Unique Bogie IDs: " + bogieIds);
    }

    // UC4
    public static void manageTrainConsist() {
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist: " + trainConsist);

        trainConsist.add(1, "Pantry Car");
        System.out.println("After adding Pantry Car: " + trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After removing first and last bogie: " + trainConsist);
    }

    public static void displayTrainConsist() {
        System.out.println("Final Train Consist: " + trainConsist);
    }

    // UC5
    public static void manageTrainFormation() {
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");

        System.out.println("\nTrain Formation: " + trainFormation);
    }

    public static void displayTrainFormation() {
        System.out.println("Final Train Formation: " + trainFormation);
    }

    // UC6
    public static void manageBogieCapacity() {
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);
        System.out.println("\nBogie Capacity Mapping Added.");
    }

    public static void displayBogieCapacity() {
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}