package speedm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<Integer> getDataFromFile(Path inputPath) throws IOException {
        List<String> linesFromFile = Files.readAllLines(inputPath);
        List<Integer> inputInts = new ArrayList<>();
        for (String line : linesFromFile) {
            inputInts.add(Integer.parseInt(line));
        }
        return inputInts;
    }


}
