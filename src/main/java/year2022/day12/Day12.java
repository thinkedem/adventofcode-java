package year2022.day12;

import utils.OneTypeDaySolver;

public class Day12 extends OneTypeDaySolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "Sabqponm",
            "abcryxxl",
            "accszExk",
            "acctuvwj",
            "abdefghi",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 31;
    }

    @Override
    protected Integer getTestResult2() {
        return 29;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day12 day = new Day12();
        day.run(args);
        day.run(new String[]{ "year2022/Day12.txt" });
    }
}
