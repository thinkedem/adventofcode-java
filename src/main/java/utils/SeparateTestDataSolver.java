package utils;

abstract public class SeparateTestDataSolver<T> extends OneTypeDaySolver<T> {
    abstract protected String[] getSecondTestData();

    abstract public void loadData(String[] data, String[] second);

    @Override
    protected void loadTestData() {
        loadData(getTestData(), getSecondTestData());
    }
}
