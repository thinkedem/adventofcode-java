package year2022.day07;

import utils.OneTypeDaySolver;

public class Day07 extends OneTypeDaySolver<Long> {

    @Override
    protected String[] getTestData() {
        return new String[]{
            "$ cd /",
            "$ ls",
            "dir a",
            "14848514 b.txt",
            "8504156 c.dat",
            "dir d",
            "$ cd a",
            "$ ls",
            "dir e",
            "29116 f",
            "2557 g",
            "62596 h.lst",
            "$ cd e",
            "$ ls",
            "584 i",
            "$ cd ..",
            "$ cd ..",
            "$ cd d",
            "$ ls",
            "4060174 j",
            "8033020 d.log",
            "5626152 d.ext",
            "7214296 k",
        };
    }

    @Override
    protected Long getTestResult1() {
        return 95437L;
    }

    @Override
    protected Long getTestResult2() {
        return 24933642L;
    }

    @Override
    public void loadData(String[] data) {

    }

    @Override
    public void calculateResults() {

    }

    public static void main(String[] args) {
        Day07 day = new Day07();
        day.run(args);
        // day.run(new String[]{ "year2022/Day07.txt" });
    }
}
