import java.util.Scanner;

public class CompClub {
    public static void main(String[] args) {
        printWelcome();
        Scanner scanf = new Scanner(System.in);
        printOptions();





        scanf.close();
    }
    public static void printWelcome() {
        System.out.println("\n" + //
                "\n" + //
                " __       __            __                                                      __                       ______    ______   __       __   ______  \n" + //
                "|  \\  _  |  \\          |  \\                                                    |  \\                     /      \\  /      \\ |  \\     /  \\ /      \\ \n" + //
                "| $$ / \\ | $$  ______  | $$  _______   ______   ______ ____    ______         _| $$_     ______        |  $$$$$$\\|  $$$$$$\\| $$\\   /  $$|  $$$$$$\\\n" + //
                "| $$/  $\\| $$ /      \\ | $$ /       \\ /      \\ |      \\    \\  /      \\       |   $$ \\   /      \\       | $$   \\$$| $$   \\$$| $$$\\ /  $$$| $$___\\$$\n" + //
                "| $$  $$$\\ $$|  $$$$$$\\| $$|  $$$$$$$|  $$$$$$\\| $$$$$$\\$$$$\\|  $$$$$$\\       \\$$$$$$  |  $$$$$$\\      | $$      | $$      | $$$$\\  $$$$ \\$$    \\ \n" + //
                "| $$ $$\\$$\\$$| $$    $$| $$| $$      | $$  | $$| $$ | $$ | $$| $$    $$        | $$ __ | $$  | $$      | $$   __ | $$   __ | $$\\$$ $$ $$ _\\$$$$$$\\\n" + //
                "| $$$$  \\$$$$| $$$$$$$$| $$| $$_____ | $$__/ $$| $$ | $$ | $$| $$$$$$$$        | $$|  \\| $$__/ $$      | $$__/  \\| $$__/  \\| $$ \\$$$| $$|  \\__| $$\n" + //
                "| $$$    \\$$$ \\$$     \\| $$ \\$$     \\ \\$$    $$| $$ | $$ | $$ \\$$     \\         \\$$  $$ \\$$    $$       \\$$    $$ \\$$    $$| $$  \\$ | $$ \\$$    $$\n" + //
                " \\$$      \\$$  \\$$$$$$$ \\$$  \\$$$$$$$  \\$$$$$$  \\$$  \\$$  \\$$  \\$$$$$$$          \\$$$$   \\$$$$$$         \\$$$$$$   \\$$$$$$  \\$$      \\$$  \\$$$$$$ \n" + //
                "\n" + //
                "");
    }
    public static void printOptions() {
        System.out.println("Select operation:");
        System.out.println("1 - Create new user");
    }
}