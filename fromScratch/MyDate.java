package fromScratch;

import java.util.Scanner;



class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

class MyDate23 {
    private int day;
    private int month;
    private int year;

    public MyDate23() {
        // Default constructor with no arguments
    }

    public MyDate23(int day, int month, int year) throws InvalidDayException, InvalidMonthException {
        if (year < 0) {
            throw new IllegalArgumentException("Invalid year: Year cannot be negative.");
        }

        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: Month must be between 1 and 12.");
        }

        int maxDaysInMonth = 31; // Assume maximum days in a month

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDaysInMonth = 30;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDaysInMonth = 29; // Leap year
            } else {
                maxDaysInMonth = 28;
            }
        }

        if (day < 1 || day > maxDaysInMonth) {
            throw new InvalidDayException("Invalid day for the given month.");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayDate() {
        System.out.println("Valid date: " + day + "/" + month + "/" + year);
    }
}

public class MyDate{
    public static void main(String[] args) {
        try {
            Scanner scanner =new Scanner(System.in);
System.out.println("enter the date");
int day =scanner.nextInt();
System.out.println("enter the month");
int month =scanner.nextInt();
System.out.println("enter the year");
int year =scanner.nextInt();
            MyDate23 date = new MyDate23(day, month, year);
            date.displayDate();
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format in command-line arguments.");
        } catch (InvalidDayException | InvalidMonthException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
