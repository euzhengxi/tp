package seedu.duke;

import java.util.Scanner;
public class Ui {


    public static void greetUser() {
        System.out.println("Welcome to secureNUS v1.0\n" +
                "Current Features\n" +
                "Adding a password      : new [NAME] \n" +
                "Adding a NUSNet ID     : new o/NUSNet [NAME] \n" +
                "Adding a Student ID    : new o/StudentID [NAME] \n");
    }

    public static void printLine() {
        System.out.print("_____________________________________________________\n");
    }

    public static String readCommand() {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            return in.nextLine();
        }
        in.close();
        return "";
    }

}