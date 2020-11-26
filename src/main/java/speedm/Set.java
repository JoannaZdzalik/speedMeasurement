package speedm;

import lombok.*;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Set {

    List<Integer> measurements;

    public static List<Set> createSetsFromInput(String file) throws IOException {
        List<Integer> inputInts = FileReader.getDataFromFile(Paths.get(file));
        List<Set> sets = new ArrayList<>();
        int setsToCreate = inputInts.get(0);
        if(isInputValid(inputInts.get(1))){
            while (setsToCreate != 0) {
                int setSize = inputInts.get(1);
                List<Integer> measurements = new ArrayList<>();
                Set set = new Set();
                for (int i = 2; i < setSize + 2; i++) {
                    measurements.add(inputInts.get(i)); }
                set.setMeasurements(measurements);
                sets.add(set);
                for (int i = setSize + 1; i > 0; i--) {
                    inputInts.remove(i); }
                setsToCreate--;
            }
        }
        return sets;
    }


    static boolean isInputValid(int nrOfValues) {
        if (nrOfValues < 1 || nrOfValues > 5000) {
            throw new IllegalArgumentException("Invalid input: nr of values in set must be between 1 and 5000!");
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Set set = (Set) o;
        return measurements.equals(set.measurements);
    }

}
