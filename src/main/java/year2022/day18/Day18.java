package year2022.day18;

import utils.OneTypeDaySolver;

public class Day18 extends OneTypeDaySolver<Integer> {


    @Override
    protected String[] getTestData() {
        return new String[]{
            "2,2,2",
            "1,2,2",
            "3,2,2",
            "2,1,2",
            "2,3,2",
            "2,2,1",
            "2,2,3",
            "2,2,4",
            "2,2,6",
            "1,2,5",
            "3,2,5",
            "2,1,5",
            "2,3,5",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 64;
    }

    @Override
    protected Integer getTestResult2() {
        return 58;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day18 day = new Day18();
        day.run(args);
        day.run(new String[]{ "year2022/Day18.txt" });
    }
}
