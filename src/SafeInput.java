import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean finished = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                finished = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Invalid Input: \"" + trash + "\". Please enter a valid integer!");
            }
        } while (!finished);
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        boolean finished = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                finished = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Invalid Input: \"" + trash + "\". Please enter a valid double!");
            }
        } while (!finished);
        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        boolean finished = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                if (retInt >= low && retInt <= high) {
                    finished = true;
                } else {
                    System.out.println("Invalid input: \"" + retInt + "\" is out of range [" + low + " - " + high + "].");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Invalid input: \"" + trash + "\". Please enter an integer.");
            }
        } while (!finished);
        return retInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = 0;
        boolean finished = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                if (retDouble >= low && retDouble <= high) {
                    finished = true;
                } else {
                    System.out.println("Invalid input: \"" + retDouble + "\" is out of range [" + low + " - " + high + "].");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid double.");
            }
        } while (!finished);
        return retDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        boolean finished = false;
        boolean retBool = false;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                retBool = true;
                finished = true;
            } else if (response.equalsIgnoreCase("N")) {
                retBool = false;
                finished = true;
            } else {
                System.out.println("Invalid input: \"" + response + "\". You must enter Y or N.");
            }
        } while (!finished);
        return retBool;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString = "";
        boolean finished = false;
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
            if (retString.matches(regEx)) {
                finished = true;
            } else {
                System.out.println("Input does not match pattern: " + regEx);
            }
        } while (!finished);
        return retString;
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        int spacesNeeded = totalWidth - 6 - msg.length();
        int leftSpaces = spacesNeeded / 2;
        int rightSpaces = spacesNeeded - leftSpaces;

        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
