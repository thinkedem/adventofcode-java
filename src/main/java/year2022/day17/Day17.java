package year2022.day17;

import utils.OneTypeDaySolver;

public class Day17 extends OneTypeDaySolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            ">>><<><>><<<>><>>><<<>>><<<><<<>><>><<>>"
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 3068;
    }

    @Override
    protected Integer getTestResult2() {
        return null;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day17 day = new Day17();
        day.run(args);
//        day.run(new String[]{ "year2022/Day17.txt" });
    }
}
