package Task2.example;

public class Main {

    // Returns true if the year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    // Returns how many days are in the given month
    public static int daysInMonth(int year, int month) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            }
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }

    // Returns the number of days between the two dates
    public static int daysBetween(int year_from, int month_from, int day_from,
                                  int year_to, int month_to, int day_to) {
        int year = year_from;
        int month = month_from;
        int day = day_from;
        int count = 0;

        // Keep moving one day forward until we reach the "to" date
        while (year != year_to || month != month_to || day != day_to) {
            day = day + 1;

            // If we pass the end of the month, go to the next month
            if (day > daysInMonth(year, month)) {
                day = 1;
                month = month + 1;
            }

            // If we pass December, go to the next year
            if (month > 12) {
                month = 1;
                year = year + 1;
            }

            count = count + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(daysBetween(2024, 1, 1, 2024, 12, 31));   // 365
        System.out.println(daysBetween(2023, 12, 31, 2024, 1, 1));   // 1
        System.out.println(daysBetween(2000, 2, 28, 2000, 3, 1));    // 2
        System.out.println(daysBetween(1900, 2, 28, 1900, 3, 1));    // 1
        System.out.println(daysBetween(2026, 10, 1, 2026, 11, 19));  // 49
    }
}