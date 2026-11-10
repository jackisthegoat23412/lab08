import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter UC M-Number (MXXXXX)", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Choose an option: Open[O], Save[S], View[V], Quit[Q]", "^[OoSsVvQq]$");
        System.out.println("\nCollected Valid Data;");
        System.out.println("SSN: " + ssn);
        System.out.println("M-Number:" + mNumber);
        System.out.println("Menu Selection: " + menuChoice.toUpperCase());
    }
}