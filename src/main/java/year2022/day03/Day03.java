package year2022.day03;

import utils.OneTypeDaySolver;

public class Day03 extends OneTypeDaySolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "vJrwpWtwJgWrhcsFMMfFFhFp",
            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
            "PmmdzqPrVvPwwTWBwg",
            "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
            "ttgJtRGJQctTZtZT",
            "CrZsJsPPZsGzwwsLwLmpwMDw",
        };
    }

    @Override
    protected Integer getTestResult1() {
        return 157;
    }

    @Override
    protected Integer getTestResult2() {
        return 70;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day03 day = new Day03();
        day.run(args);
        // day.run(new String[]{ "year2022/Day03.txt" });
    }
}
