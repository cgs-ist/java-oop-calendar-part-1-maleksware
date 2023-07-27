import java.util.*;

public class Calendar {
    private List<Month> months;
    private List<Day> days;

    private Year currentYear;

    private void initialiseMonths() {
        this.months = new ArrayList<Month>();
        ArrayList<String> monthNames = new ArrayList<String>(List.of(
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        ));

        ArrayList<Integer> numOfDaysInAMonth = new ArrayList<>(List.of(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
        
        if (this.currentYear.isLeap()) {
            numOfDaysInAMonth.set(1, 29);
        } else {
            numOfDaysInAMonth.set(1, 28);
        }

        for (int i = 0; i < 12; i++) {
            this.months.add(new Month(monthNames.get(i), numOfDaysInAMonth.get(i)));
        }
    }

    private void initialiseDays() {
        this.days = new ArrayList<Day>();
        for (int monthNumber = 0; monthNumber < 12; monthNumber++) {
            for (int i = 0; i < this.months.get(monthNumber).getNumOfDays(); i++) {
                this.days.add(new Day(i + 1, monthNumber + 1, this.currentYear.getYear()));
            }
        }
    }

    public Calendar(int currentYear) {
        this.currentYear = new Year(currentYear);
        this.initialiseMonths();
        this.initialiseDays();
    }

    public List<Month> getMonths() {
        return this.months;
    }

    public List<Day> getDays() {
        return this.days;
    }
}
