package year2022.day02;

import utils.OneTypeDaySolver;

public class Day02 extends OneTypeDaySolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "A Y",
            "B X",
            "C Z",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 15;
    }

    @Override
    protected Integer getTestResult2() {
        return 12;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day02 day = new Day02();
        day.run(args);
        // day.run(new String[]{ "year2022/Day02.txt" });
    }
}
