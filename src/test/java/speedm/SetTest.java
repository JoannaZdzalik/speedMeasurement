package speedm;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SetTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private List<Integer> m1 = new ArrayList<>();
    private List<Integer> m2 = new ArrayList<>();
    private List<Integer> m3 = new ArrayList<>();
    private Set s1 = new Set();
    private Set s2 = new Set();
    private Set s3 = new Set();

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
        s1.setMeasurements(m1);
        s2.setMeasurements(m2);
        s3.setMeasurements(m3);
    }

    @Test
    public void shouldMakeSetsFromGivenInput() throws IOException {
        List<Set> sets = Set.createSetsFromInput("src/test/java/resources/testinput.txt");
        int nrOfSets = sets.size();
        Set set1FromFile = sets.get(0);
        Set set2FromFile = sets.get(1);
        Set set3FromFile = sets.get(2);

        assertEquals(3, nrOfSets);
        assertEquals(s1, set1FromFile);
        assertEquals(s2, set2FromFile);
        assertEquals(s3, set3FromFile);
    }

    @Test(expected = Test.None.class)
    public void shouldCreateSetWithMeasurements() {
        Set set = new Set(m1);
        assertEquals(4, set.getMeasurements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenInputIsInvalid() {
        Set.isInputValid(6000);
    }

    @Test
    public void shouldReturnTrueWhenNrOfValuesIsValid() {
        Assert.assertTrue("Nr of values in set is correct", Set.isInputValid(8));
    }
}
