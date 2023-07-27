public class Month {
    private String name;
    private int numOfDays;

    public Month(String name, int numOfDays) {
        this.name = name;
        this.numOfDays = numOfDays;
    }

    public int getNumOfDays() {
        return this.numOfDays;
    }

    public String getName() {
        return this.name;
    }
}
