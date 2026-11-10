import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter birth year", 1900, 2026);
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);
        int highDay = 31;
        switch (month) {
            case 2:
                highDay = 29;
                break;
            case 4: case 6: case 9: case 11:
                highDay = 30;
                break;
            default:
                highDay = 31;
                break;
        }
        int day = SafeInput.getRangedInt(in, "Enter birth day", 1, highDay);
        int hours = SafeInput.getRangedInt(in, "Enter birth hour", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter birth minute", 1, 59);
        System.out.println("\nBirth Date & Time: " + month + "/" + day + "/" + year + " at " + hours + ":" + minutes);
    }
}
