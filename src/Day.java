public class Day {
    private int dayOfMonth;
    private int month;
    private int year;

    public Day(int dayOfMonth, int month, int year) {
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.year = year;
    }

    public int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public int getMonthNumber() {
        return this.month;
    }

    public int getYearNumber() {
        return this.year;
    }
}
