package year2022.day14;

import utils.OneTypeDaySolver;

public class Day14 extends OneTypeDaySolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "498,4 -> 498,6 -> 496,6",
            "503,4 -> 502,4 -> 502,9 -> 494,9",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 24;
    }

    @Override
    protected Integer getTestResult2() {
        return 93;
    }

    @Override
    public void loadData(String[] data) {
    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day14 day = new Day14();
        day.run(args);
        day.run(new String[]{ "year2022/Day14.txt" });
    }
}
