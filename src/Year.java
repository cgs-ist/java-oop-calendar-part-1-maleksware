public class Year {
    private int year;
    private boolean isLeap;

    public Year(int year) {
        this.year = year;
        if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
            this.isLeap = true;
        } else {
            this.isLeap = false;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
        if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
            this.isLeap = true;
        } else {
            this.isLeap = false;
        }
    }

    public boolean isLeap() {
        return this.isLeap;
    }
}
