import java.util.Scanner;

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        day = 0;
        month = 0;
        year = 0;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getday(){
    	return day;
    }
    
    public int getmonth() {
    	return month;
    }

    public int getyear(){
    	return year;
    }


    public void assignDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayShort() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }

    public void displayVerbose() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(day + " " + months[month - 1] + " " + year);
    }

    public void nextDay() {
        int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year) && month == 2) {
            daysInMonth[1] = 29;
        }

        day++;
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
