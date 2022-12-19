package utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

abstract public class DaySolver<T1, T2> {
    protected T1 result1;
    protected T2 result2;
    /**
     * Provided test data
     * @return String[]
     */
    abstract protected String[] getTestData();

    protected void loadTestData() {
        this.loadData(getTestData());
    }

    /**
     * The expected part 1 result for the test data
     * @return T
     */
    abstract protected T1 getTestResult1();

    protected boolean compareTestResult1() {
        return result1 != null && result1.equals(getTestResult1());
    }

    /**
     * The expected part 2 result for the test data
     * @return T
     */
    abstract protected T2 getTestResult2();

    protected boolean compareTestResult2() {
        return result2 != null && result2.equals(getTestResult2());
    }

    /**
     * Preparse data
     * @param data input data
     */
    abstract public void loadData(String[] data);

    /**
     * The main method that calculates the results
     */
    abstract public void calculateResults();

    public T1 getResult1() {
        return result1;
    }

    public T2 getResult2() {
        return result2;
    }

    /**
     * Run with test data
     */
    public void run() {
        loadTestData();
        calculateResults();
    }

    /**
     * Handle run on a specific file
     *
     * @param filename the input file
     */
    public void run(String filename) {
        Path path;
        try {
            URL res = getClass().getClassLoader().getResource(filename);
            path = res != null ? Paths.get(res.toURI()) : Paths.get(filename);
            loadData(Files.readAllLines(path).toArray(new String[0]));
            calculateResults();

        } catch (IOException e) {
            System.err.printf("Error reading file %s:\n", filename);
            e.printStackTrace(System.err);
        } catch (URISyntaxException ignored) {
            // should not happen.
        }
    }

    /**
     * Handle run from main()
     *
     * @param args command line arguments
     */
    protected void run(String[] args) {
        if (args.length > 0) {
            for(String filename : args) {
                run(filename);
                printResults();
            }
        } else {
            run();
            printTestResults();
        }
    }

    protected void printTestResult1() {
        T1 testResult1 = getTestResult1();
        System.out.println("Part 1 test result: " + result1 + " (Expected: " + testResult1 + " - " + (compareTestResult1() ? "PASS" : "FAIL") + ")");
    }

    protected void printTestResult2() {
        T2 testResult2 = getTestResult2();
        if (testResult2 != null) {
            System.out.println("Part 2 test result: " + result2 + " (Expected: " + testResult2 + " - " + (compareTestResult2() ? "PASS" : "FAIL") + ")");
        }
    }

    protected void printTestResults() {
        printTestResult1();
        printTestResult2();
    }

    protected void printResults() {
        System.out.println("Part 1 result: " + result1);
        if (result1 != null) {
            System.out.println("Part 2 result: " + result2);
        }
    }
}
