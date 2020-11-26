package speedm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solver {

    public static void main(String[] args) throws IOException {
        Solver s = new Solver();
        s.solve("input.txt");
    }

    public void solve(String file) throws IOException {
        List<Set> sets = Set.createSetsFromInput(file);
        for (Set s : sets) {
            System.out.println(calculateMinSpeed(s) + " " + calculateMaxSpeed(s));
        }
    }

    public int calculateMaxSpeed(Set set) {
        int maxSpeed = 0;
        for (int i = 0; i < set.getMeasurements().size(); i++) {
            maxSpeed += set.getMeasurements().get(i);
        }
        return maxSpeed;
    }

    public int calculateMinSpeed(Set set) {
        List<Integer> allMeasurements = new ArrayList<>(set.getMeasurements());
        int desiredSum = sumValues(allMeasurements) / 2;
        List<Integer> sublist1 = new ArrayList<>();
        int sumInSublist1 = 0;
        allMeasurements.sort(Collections.reverseOrder());
        if (allMeasurements.get(0) > desiredSum) {
            sublist1.add(allMeasurements.get(0));
            allMeasurements.remove(0);
            sumInSublist1 = sumValues(sublist1);
        } else {
            for (int i = 0; i < allMeasurements.size(); i++) {
                int tempSum = sumInSublist1 + allMeasurements.get(i);
                if (tempSum <= desiredSum) {
                    sublist1.add(allMeasurements.get(i));
                    allMeasurements.remove(i);
                    sumInSublist1 = sumValues(sublist1);
                }
            }
        }
        List<Integer> sublist2 = new ArrayList<>(allMeasurements);
        int sumInSublist2 = sumValues(sublist2);
        return Math.abs(sumInSublist1 - sumInSublist2);
    }

    public int sumValues(List<Integer> list) {
        int sum = 0;
        for (Integer value : list) {
            sum += value;
        }
        return sum;
    }

}
