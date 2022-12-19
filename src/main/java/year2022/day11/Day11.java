package year2022.day11;

import utils.OneTypeDaySolver;

public class Day11 extends OneTypeDaySolver<Long> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "Monkey 0:",
            "  Starting items: 79, 98",
            "  Operation: new = old * 19",
            "  Test: divisible by 23",
            "    If true: throw to monkey 2",
            "    If false: throw to monkey 3",
            "",
            "Monkey 1:",
            "  Starting items: 54, 65, 75, 74",
            "  Operation: new = old + 6",
            "  Test: divisible by 19",
            "    If true: throw to monkey 2",
            "    If false: throw to monkey 0",
            "",
            "Monkey 2:",
            "  Starting items: 79, 60, 97",
            "  Operation: new = old * old",
            "  Test: divisible by 13",
            "    If true: throw to monkey 1",
            "    If false: throw to monkey 3",
            "",
            "Monkey 3:",
            "  Starting items: 74",
            "  Operation: new = old + 3",
            "  Test: divisible by 17",
            "    If true: throw to monkey 0",
            "    If false: throw to monkey 1",
        };
    }

    @Override
    protected Long getTestResult1() {
        return 10605L;
    }

    @Override
    protected Long getTestResult2() {
        return 2713310158L;
    }

    @Override
    public void loadData(String[] data) {

    }


    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day11 day = new Day11();
        day.run(args);
        day.run(new String[]{ "year2022/Day11.txt" });
    }
}
