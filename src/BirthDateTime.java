import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yearInput = 0;
        int monthInput = 0;
        int monLimit = 0;
        int dayInput = 0;
        int hourInput = 0;
        int minuteInput = 0;
        yearInput = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        monthInput = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        switch(monthInput){
            case 4:
            case 6:
            case 9:
            case 11:
                monLimit = 30;
                break;
            case 2:
                monLimit = 29;
                break;
            default:
                monLimit = 31;
                break;
        }
        dayInput = SafeInput.getRangedInt(in, "Enter your birth day", 1, monLimit);
        hourInput = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minuteInput = SafeInput.getRangedInt(in, "Enter your birth minute",1, 59);
        System.out.println("Here's the birth info you entered. Year: " + yearInput + " Month: " + monthInput +
                " Day: " + dayInput + " Hour: " + hourInput + " Minute: " + minuteInput + ".");
    }
}
