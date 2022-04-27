import static org.junit.Assert.*;
import org.junit.*;

import java.util.List;

public class TestRemoveRuns {
    @Test
    public void testRemoveRuns() {
        List<Integer> empty = List.of();
        assertEquals(empty, RemoveRuns.removeRuns(empty));
        assertEquals(List.of(87), RemoveRuns.removeRuns(List.of(87)));
    }
}
