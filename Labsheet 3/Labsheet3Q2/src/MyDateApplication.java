import java.util.Scanner;

public class MyDateApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date1 (day month year): ");
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();

        System.out.print("Enter date2 (day month year): ");
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();

        MyDate date1 = new MyDate(day1, month1, year1);
        MyDate date2 = new MyDate(day2, month2, year2);

        MyDate earlierDate = (date1.getyear() < date2.getyear() || (date1.getyear() == date2.getyear() && date1.getmonth() < date2.getmonth()) || (date1.getyear() == date2.getyear() && date1.getmonth() == date2.getmonth() && date1.getday() < date2.getday())) ? date1 : date2;

        System.out.println("Earlier date in short format:");
        earlierDate.displayShort();
        System.out.println("Earlier date in verbose format:");
        earlierDate.displayVerbose();

        date2.nextDay();
        System.out.println("\nDate2 after next day:");
        date2.displayShort();
        date2.displayVerbose();
}
}