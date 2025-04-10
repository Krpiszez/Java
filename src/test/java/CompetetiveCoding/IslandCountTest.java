// File: CompetetiveCoding/IslandCountIterativeTest.java
package CompetetiveCoding;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IslandCountTest {

    @Test
    public void testSampleGrid() {
        List<List<String>> grid = List.of(
                List.of("W", "L", "W", "W", "W"),
                List.of("W", "L", "W", "W", "W"),
                List.of("W", "W", "W", "L", "W"),
                List.of("W", "W", "L", "L", "W"),
                List.of("L", "W", "W", "L", "L"),
                List.of("L", "L", "W", "W", "W")
        );

        int expected = 3;
        int result = IslandCount.islandCount(grid);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyGrid() {
        List<List<String>> grid = List.of();
        int expected = 0;
        int result = grid.isEmpty() ? 0 : IslandCount.islandCount(grid);
        assertEquals(expected, result);
    }

    @Test
    public void testAllWater() {
        List<List<String>> grid = List.of(
                List.of("W", "W"),
                List.of("W", "W")
        );
        assertEquals(0, IslandCount.islandCount(grid));
    }

    @Test
    public void testAllLand() {
        List<List<String>> grid = List.of(
                List.of("L", "L"),
                List.of("L", "L")
        );
        assertEquals(1, IslandCount.islandCount(grid));
    }

    @Test
    public void testMultipleIslands() {
        List<List<String>> grid = List.of(
                List.of("L", "W", "L"),
                List.of("W", "W", "W"),
                List.of("L", "W", "L")
        );
        assertEquals(4, IslandCount.islandCount(grid));
    }
}