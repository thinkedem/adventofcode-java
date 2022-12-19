package year2022.day06;

import utils.SingleLineDaySolver;

import java.util.List;

public class Day06 extends SingleLineDaySolver<Integer> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "mjqjpqmgbljsphdztnvjfqwrcgsmlb",
            "bvwbjplbgvbhsrlpgdmjqwftvncz",
            "nppdvjthqldpwncqszvftbrmjlhg",
            "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg",
            "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"
        };
    }

    @Override
    protected List<Integer> getTestResults1() {
        return List.of( 7, 5, 6, 10, 11 );
    }

    @Override
    protected List<Integer> getTestResults2() {
        return List.of( 19, 23, 23, 29, 26 );
    }

    @Override
    public void loadData(String data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day06 day = new Day06();
        day.run(args);
        // day.run(new String[]{ "year2022/Day06.txt" });
    }
}
