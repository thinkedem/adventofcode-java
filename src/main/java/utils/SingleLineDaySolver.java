package utils;

import java.util.ArrayList;
import java.util.List;

abstract public class SingleLineDaySolver<T> extends OneTypeDaySolver<T> {

    private List<T> results1;
    private List<T> results2;

    public List<T> getResults1() {
        return results1;
    }

    public List<T> getResults2() {
        return results2;
    }

    @Override
    public T getTestResult1() {
        return null;
    }

    @Override
    public T getTestResult2() {
        return null;
    }

    abstract protected List<T> getTestResults1();

    abstract protected List<T> getTestResults2();

    abstract public void loadData(String data);

    @Override
    public void loadData(String[] data) {
        loadData(data[0]);
    }

    @Override
    public void run() {
        String[] testData = getTestData();

        results1 = new ArrayList<>();
        results2 = new ArrayList<>();
        for (String testDatum : testData) {
            loadData(testDatum);
            calculateResults();
            results1.add(result1);
            results2.add(result2);
        }
    }
}
