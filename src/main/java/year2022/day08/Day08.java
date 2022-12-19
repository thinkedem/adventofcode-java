package year2022.day08;

import utils.OneTypeDaySolver;

public class Day08 extends OneTypeDaySolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "30373",
            "25512",
            "65332",
            "33549",
            "35390",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 21;
    }

    @Override
    protected Integer getTestResult2() {
        return 8;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day08 day = new Day08();
        day.run(args);
        day.run(new String[]{ "year2022/Day08.txt" });
    }
}
