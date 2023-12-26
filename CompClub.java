import java.util.ArrayList;
import java.util.Scanner;

public class CompClub {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Computer> computers = new ArrayList<>();
    static Scanner scanf = new Scanner(System.in);
    public static void main(String[] args) { 
        printWelcome();
        loop: while (true) {
            printOptions();
            String option = scanf.nextLine();
            switch (option) {
                case "1":
                    createUser();
                    break;
                case "2":
                    replenishBalance();
                    break;
                case "3":
                    bookComputer();
                    break;
                case "4":
                    //
                    break;
                case "5":
                    listComputers();
                    break;
                case "6":
                    listUsers();
                    break;
                case "exit":
                    scanf.close();
                    break loop;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        }
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
                "\n");
    }
    public static void printOptions() {
        System.out.println();
        System.out.println("Select operation:");
        System.out.println("1 - Create new user");
        System.out.println("2 - Add money to account");
        System.out.println("3 - Book a computer");
        System.out.println("4 - Extend a session");
        System.out.println("5 - List computers");
        System.out.println("6 - List users");
        System.out.println("exit - to exit");
        System.out.println();
        System.out.print("input: ");
    }

    public static void createUser() {
        String nickname = scanf.nextLine();
        User newUser = new User(nickname);
        users.add(newUser);
        return;
    }

    public static void listUsers() {
        for (int i=0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

    public static void replenishBalance() {
        User user = getUser();
        System.out.print("How much money you want to add: ");
        int money = scanf.nextInt();
        user.setMoney(money);
    }

    public static void bookComputer() {
        User user = getUser();
        System.out.println("What computer you want to book?");
        System.out.println("1 - vip");
        System.out.println("2 - non vip");
        System.out.println("cancel - cancel booking");
        String option = scanf.nextLine();
        Boolean isVip = false;
        switch (option) {
            case "1":
                isVip = true;
                break;
            case "2":
                isVip = false;
                break;
            case "cancel":
                System.out.println("Booking cancelled");
                return;
            default:
                System.out.println("Incorrect option");
                break;
        }
        System.out.println("How many hours do you want to book: ");
        int hours = scanf.nextInt();
        Computer computer = new Computer(user, isVip, hours);
        computers.add(computer);
    }

    public static User getUser() {
        System.out.print("Type id of your account: ");
        int id = scanf.nextInt();
        return users.get(id);
    }

    public static void listComputers() {
        for (int i=0; i < computers.size(); i++) {
            System.out.println(computers.get(i));
        }
    }
}