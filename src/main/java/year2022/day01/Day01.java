package year2022.day01;

import utils.OneTypeDaySolver;

public class Day01 extends OneTypeDaySolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "1000",
            "2000",
            "3000",
            "",
            "4000",
            "",
            "5000",
            "6000",
            "",
            "7000",
            "8000",
            "9000",
            "",
            "10000",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 24000;
    }

    @Override
    protected Integer getTestResult2() {
        return 45000;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day01 day = new Day01();
        day.run(args);
        // day.run(new String[]{ "year2022/Day01.txt" });
    }
}
