package speedm;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Path workingDir;

    @Before
    public void setUp() {
        this.workingDir = Path.of("", "src/test/java/resources");
    }

    @Test
    public void shouldCreateListOf15Integers() throws IOException {
        List<Integer> inputs = FileReader.getDataFromFile(workingDir.resolve("testinput.txt"));
        assertEquals(15, inputs.size());
    }


}
