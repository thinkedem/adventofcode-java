package year2022.day09;

import utils.SeparateTestDataSolver;

public class Day09 extends SeparateTestDataSolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "R 4",
            "U 4",
            "L 3",
            "D 1",
            "R 4",
            "D 1",
            "L 5",
            "R 2",
        };
    }

    public String[] getSecondTestData() {
        return new String[]{
            "R 5",
            "U 8",
            "L 8",
            "D 3",
            "R 17",
            "D 10",
            "L 25",
            "U 20",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 13;
    }

    @Override
    protected Integer getTestResult2() {
        return 36;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void loadData(String[] data, String[] second) {
        this.loadData(data);
        
    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day09 day = new Day09();
        day.run(args);
        day.run(new String[]{ "year2022/Day09.txt" });
    }
}
