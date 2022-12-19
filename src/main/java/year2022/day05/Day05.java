package year2022.day05;

import utils.OneTypeDaySolver;

public class Day05 extends OneTypeDaySolver<String> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "    [D]    ",
            "[N] [C]    ",
            "[Z] [M] [P]",
            " 1   2   3 ",
            "",
            "move 1 from 2 to 1",
            "move 3 from 1 to 3",
            "move 2 from 2 to 1",
            "move 1 from 1 to 2",
        };
    }

    @Override
    protected String getTestResult1() {
        return "CMZ";
    }

    @Override
    protected String getTestResult2() {
        return "MCD";
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day05 day = new Day05();
        day.run(args);
        // day.run(new String[]{ "year2022/Day05.txt" });
    }
}
