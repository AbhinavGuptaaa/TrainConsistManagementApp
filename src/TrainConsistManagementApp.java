import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {


    static List<String> bogies = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        displaySummary();
    }

    public static void displaySummary() {
        System.out.println("Initial Bogie Count: " + bogies.size());
    }
}