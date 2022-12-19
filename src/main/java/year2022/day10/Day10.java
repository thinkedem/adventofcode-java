package year2022.day10;

import utils.DaySolver;

import java.util.stream.IntStream;


public class Day10 extends DaySolver<Integer, String[]> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "addx 15",
            "addx -11",
            "addx 6",
            "addx -3",
            "addx 5",
            "addx -1",
            "addx -8",
            "addx 13",
            "addx 4",
            "noop",
            "addx -1",
            "addx 5",
            "addx -1",
            "addx 5",
            "addx -1",
            "addx 5",
            "addx -1",
            "addx 5",
            "addx -1",
            "addx -35",
            "addx 1",
            "addx 24",
            "addx -19",
            "addx 1",
            "addx 16",
            "addx -11",
            "noop",
            "noop",
            "addx 21",
            "addx -15",
            "noop",
            "noop",
            "addx -3",
            "addx 9",
            "addx 1",
            "addx -3",
            "addx 8",
            "addx 1",
            "addx 5",
            "noop",
            "noop",
            "noop",
            "noop",
            "noop",
            "addx -36",
            "noop",
            "addx 1",
            "addx 7",
            "noop",
            "noop",
            "noop",
            "addx 2",
            "addx 6",
            "noop",
            "noop",
            "noop",
            "noop",
            "noop",
            "addx 1",
            "noop",
            "noop",
            "addx 7",
            "addx 1",
            "noop",
            "addx -13",
            "addx 13",
            "addx 7",
            "noop",
            "addx 1",
            "addx -33",
            "noop",
            "noop",
            "noop",
            "addx 2",
            "noop",
            "noop",
            "noop",
            "addx 8",
            "noop",
            "addx -1",
            "addx 2",
            "addx 1",
            "noop",
            "addx 17",
            "addx -9",
            "addx 1",
            "addx 1",
            "addx -3",
            "addx 11",
            "noop",
            "noop",
            "addx 1",
            "noop",
            "addx 1",
            "noop",
            "noop",
            "addx -13",
            "addx -19",
            "addx 1",
            "addx 3",
            "addx 26",
            "addx -30",
            "addx 12",
            "addx -1",
            "addx 3",
            "addx 1",
            "noop",
            "noop",
            "noop",
            "addx -9",
            "addx 18",
            "addx 1",
            "addx 2",
            "noop",
            "noop",
            "addx 9",
            "noop",
            "noop",
            "noop",
            "addx -1",
            "addx 2",
            "addx -37",
            "addx 1",
            "addx 3",
            "noop",
            "addx 15",
            "addx -21",
            "addx 22",
            "addx -6",
            "addx 1",
            "noop",
            "addx 2",
            "addx 1",
            "noop",
            "addx -10",
            "noop",
            "noop",
            "addx 20",
            "addx 1",
            "addx 2",
            "addx 2",
            "addx -6",
            "addx -11",
            "noop",
            "noop",
            "noop",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 13140;
    }

    @Override
    protected String[] getTestResult2() {
        return new String[]{
            "##..##..##..##..##..##..##..##..##..##..",
            "###...###...###...###...###...###...###.",
            "####....####....####....####....####....",
            "#####.....#####.....#####.....#####.....",
            "######......######......######......####",
            "#######.......#######.......#######.....",
        };
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    @Override
    protected void printTestResult2() {
        String[] testResult2 = getTestResult2();
        if (testResult2 != null) {
            System.out.println("Part 2 test result: "  + (compareTestResult2() ? "PASS" : "FAIL") + ")\n - result:\n" + String.join("\n", result2) + "\n - expected:\n" + String.join("\n", testResult2));
        }
    }

    @Override
    protected boolean compareTestResult2() {
        if (result2 == null) return false;
        String[] testResult2 = getTestResult2();
        if (testResult2 == null || result2.length != testResult2.length) return false;
        return IntStream.range(0, testResult2.length).allMatch(i -> testResult2[i].equals(result2[i]));
    }

    @Override
    protected void printResults() {
        System.out.println("Part 1 result: " + result1);
        if (result1 != null) {
            System.out.println("Part 2 result: \n" + String.join("\n", result2));
        }
    }

    public static void main(String[] args) {
        Day10 day = new Day10();
        day.run(args);
        day.run(new String[]{ "year2022/Day10.txt" });
    }
}
