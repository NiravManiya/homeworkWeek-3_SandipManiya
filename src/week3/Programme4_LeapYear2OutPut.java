package week3;
/*
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400
 */
public class Programme4_LeapYear2OutPut {
    public static void main(String[] args) {
        // Testing isLeapYear method
        System.out.println(isLeapYear(-1600)); // should return false
        System.out.println(isLeapYear(1600));  // should return true
        System.out.println(isLeapYear(2017));  // should return false
        System.out.println(isLeapYear(2000));  // should return true

        // Testing getDaysInMonth method
        System.out.println(getDaysInMonth(1, 2020));  // should return 31
        System.out.println(getDaysInMonth(2, 2020));  // should return 29
        System.out.println(getDaysInMonth(2, 2018));  // should return 28
        System.out.println(getDaysInMonth(-1, 2020)); // should return -1
        System.out.println(getDaysInMonth(1, -2020)); // should return -1
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 2:
                return (isLeapYear(year)) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}
