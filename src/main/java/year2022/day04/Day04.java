package year2022.day04;

import utils.OneTypeDaySolver;

public class Day04 extends OneTypeDaySolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "2-4,6-8",
            "2-3,4-5",
            "5-7,7-9",
            "2-8,3-7",
            "6-6,4-6",
            "2-6,4-8",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 2;
    }

    @Override
    protected Integer getTestResult2() {
        return 4;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day04 day = new Day04();
        day.run(args);
        // day.run(new String[]{ "year2022/Day04.txt" });
    }
}
