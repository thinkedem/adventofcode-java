package year2022.day15;

import utils.OneTypeDaySolver;


public class Day15 extends OneTypeDaySolver<Long> {
    private int rowNumber;
    private int maxXY;
    @Override
    protected String[] getTestData() {
        return new String[]{
            "Sensor at x=2, y=18: closest beacon is at x=-2, y=15",
            "Sensor at x=9, y=16: closest beacon is at x=10, y=16",
            "Sensor at x=13, y=2: closest beacon is at x=15, y=3",
            "Sensor at x=12, y=14: closest beacon is at x=10, y=16",
            "Sensor at x=10, y=20: closest beacon is at x=10, y=16",
            "Sensor at x=14, y=17: closest beacon is at x=10, y=16",
            "Sensor at x=8, y=7: closest beacon is at x=2, y=10",
            "Sensor at x=2, y=0: closest beacon is at x=2, y=10",
            "Sensor at x=0, y=11: closest beacon is at x=2, y=10",
            "Sensor at x=20, y=14: closest beacon is at x=25, y=17",
            "Sensor at x=17, y=20: closest beacon is at x=21, y=22",
            "Sensor at x=16, y=7: closest beacon is at x=15, y=3",
            "Sensor at x=14, y=3: closest beacon is at x=15, y=3",
            "Sensor at x=20, y=1: closest beacon is at x=15, y=3",
        };
    }

    @Override
    protected Long getTestResult1() {
        return 26L;
    }

    @Override
    protected Long getTestResult2() {
        return 56000011L;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day15 day = new Day15();
        day.rowNumber = 10;
        day.maxXY = 20;
        day.run(args);

        day.rowNumber = 2_000_000;
        day.maxXY = 4_000_000;
        day.run(new String[]{ "year2022/Day15.txt" });
    }
}
