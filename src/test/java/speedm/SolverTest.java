package speedm;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SolverTest {

    private Solver s = new Solver();
    private List<Integer> m1 = new ArrayList<>();
    private List<Integer> m2 = new ArrayList<>();
    private List<Integer> m3 = new ArrayList<>();
    private List<Integer> m4 = new ArrayList<>();
    private Set set1 =new Set();
    private Set set2 =new Set();
    private Set set3 =new Set();
    private Set set4 = new Set();

    @Before
    public void init() {
        m1.add(10);
        m1.add(3);
        m1.add(5);
        m1.add(4);
        m2.add(4);
        m2.add(11);
        m2.add(5);
        m2.add(5);
        m2.add(5);
        m3.add(9);
        m3.add(5);
        m4.add(3);
        m4.add(1);
        m4.add(6);
        set1.setMeasurements(m1);
        set2.setMeasurements(m2);
        set3.setMeasurements(m3);
        set4.setMeasurements(m4);
    }

    @Test
    public void shouldCalculateMaxSpeed() {
        int maxSpeed1 = s.calculateMaxSpeed(set1);
        int maxSpeed2 = s.calculateMaxSpeed(set2);
        int maxSpeed3 = s.calculateMaxSpeed(set3);
        int maxSpeed4 = s.calculateMaxSpeed(set4);
        assertEquals(22, maxSpeed1);
        assertEquals(30, maxSpeed2);
        assertEquals(14, maxSpeed3);
        assertEquals(10, maxSpeed4);

    }

    @Test
    public void shouldCalculateMinSpeed(){
        int minSpeed1 = s.calculateMinSpeed(set1);
        int minSpeed2 = s.calculateMinSpeed(set2);
        int minSpeed3 = s.calculateMinSpeed(set3);
        assertEquals(2, minSpeed1);
        assertEquals(0, minSpeed2);
        assertEquals(4, minSpeed3);
    }

    @Test
    public void shouldCalculateMinSpeedWhenBiggestValueIsHigherThanHalfOfTotalSum(){
        int minSpeed = s.calculateMinSpeed(set4);
        assertEquals(2, minSpeed);
    }

    @Test
    public void shouldSumValuesInList(){
        int sum = s.sumValues(m1);
        assertEquals(22, sum);
    }

    @Test
    public void shouldPrintSolution() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Solver s = new Solver();
        s.solve("src/test/java/resources/testinput.txt");
        String actual = outContent.toString();
        assertEquals(String.join(System.lineSeparator(),
                "2 22",
                "0 30",
                "4 14",
                ""
                ),
                actual
        );
    }


}
