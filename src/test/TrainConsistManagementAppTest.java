import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @BeforeEach
    void setup() {
        // Clear all static data before each test
        TrainConsistManagementApp.bogies.clear();
        TrainConsistManagementApp.bogieIds.clear();
        TrainConsistManagementApp.trainConsist.clear();
        TrainConsistManagementApp.trainFormation.clear();
        TrainConsistManagementApp.bogieCapacityMap.clear();
        TrainConsistManagementApp.bogieList.clear();
    }

    // ================= UC2 =================
    @Test
    void testAddAndRemoveBogies() {
        TrainConsistManagementApp.addBogies();

        assertTrue(TrainConsistManagementApp.bogies.contains("Sleeper"));
        assertEquals(3, TrainConsistManagementApp.bogies.size());

        TrainConsistManagementApp.removeBogie("AC Chair");
        assertFalse(TrainConsistManagementApp.bogies.contains("AC Chair"));
    }

    @Test
    void testCheckBogie() {
        TrainConsistManagementApp.addBogies();

        assertTrue(TrainConsistManagementApp.bogies.contains("Sleeper"));
        assertFalse(TrainConsistManagementApp.bogies.contains("Cargo"));
    }

    // ================= UC3 =================
    @Test
    void testBogieIdsUnique() {
        TrainConsistManagementApp.addBogieIds();

        assertEquals(3, TrainConsistManagementApp.bogieIds.size());
        assertTrue(TrainConsistManagementApp.bogieIds.contains("B1"));
    }

    // ================= UC4 =================
    @Test
    void testTrainConsistOperations() {
        TrainConsistManagementApp.manageTrainConsist();

        assertFalse(TrainConsistManagementApp.trainConsist.contains("Engine"));
        assertFalse(TrainConsistManagementApp.trainConsist.contains("Guard"));
        assertTrue(TrainConsistManagementApp.trainConsist.contains("Pantry Car"));
    }

    // ================= UC5 =================
    @Test
    void testTrainFormationNoDuplicates() {
        TrainConsistManagementApp.manageTrainFormation();

        assertEquals(4, TrainConsistManagementApp.trainFormation.size());
        assertTrue(TrainConsistManagementApp.trainFormation.contains("Sleeper"));
    }

    // ================= UC6 =================
    @Test
    void testBogieCapacityMap() {
        TrainConsistManagementApp.manageBogieCapacity();

        assertEquals(72, TrainConsistManagementApp.bogieCapacityMap.get("Sleeper"));
        assertEquals(3, TrainConsistManagementApp.bogieCapacityMap.size());
    }

    // ================= UC7 =================
    @Test
    void testBogieSorting() {
        TrainConsistManagementApp.manageBogieSorting();

        assertEquals(3, TrainConsistManagementApp.bogieList.size());

        // Check if sorted (ascending)
        assertEquals(24, TrainConsistManagementApp.bogieList.get(0).capacity);
        assertEquals(72, TrainConsistManagementApp.bogieList.get(2).capacity);
    }
}