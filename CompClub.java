import java.util.ArrayList;
import java.util.Scanner;

public class CompClub {
    static ArrayList<admin> admins = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Computer> computers = new ArrayList<>();

    public static void main(String[] args) { 
        printWelcome();
        Scanner scanf = new Scanner(System.in);
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
                    extendSession();
                    break;
                case "5":
                    listComputers();
                    break;
                case "6":
                    listUsers();
                    break;
                case "7":
                    AdminPanel();
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
    private static void printWelcome() {
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
    private static void printOptions() {
        System.out.println();
        System.out.println("Select operation:");
        System.out.println("1 - Create new user");
        System.out.println("2 - Add money to account");
        System.out.println("3 - Book a computer");
        System.out.println("4 - Extend a session");
        System.out.println("5 - List computers");
        System.out.println("6 - List users");
        System.out.println("7 - Admin Panel");
        System.out.println("exit - to exit");
        System.out.println();
        System.out.print("input: ");
    }

    private static void createUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String nickname = scan.nextLine();
        User newUser = new User(nickname);
        users.add(newUser);
        return;
    }

    private static void listUsers() {
        System.out.println("id | username | balance");
        for (int i=0; i < users.size(); i++) {
            System.out.println(i + " " + users.get(i));
        }
    }

    private static void replenishBalance() {
        Scanner scan = new Scanner(System.in);
        User user = getUser();
        System.out.print("How much money you want to add: ");
        long money = scan.nextLong();
        if (money <= 0) {
            System.out.println("You can't add negative or null values to balance");
            return;
        }
        user.GiveMoney(money);
    }

    public static void bookComputer() {
        Scanner scan = new Scanner(System.in);
        User user = getUser();
        System.out.println("What computer you want to book?");
        System.out.println("1 - vip");
        System.out.println("2 - non vip");
        System.out.println("cancel - cancel booking");
        System.out.print("input: ");
        String option = scan.nextLine();
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
        System.out.print("How many hours do you want to book: ");
        long hours = scan.nextInt();
        if (hours <= 0) {
            System.out.println("You can't use negative or null values");
            return;
        }
        Computer computer = new Computer(user, isVip, hours);
        if (computer.getHoursLeft() == 0) {
            return;
        }
        computers.add(computer);
    }
    private static void AdminPanel()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write the password to the admin panel:");
        String line = scan.nextLine();
        String password = "1234";
        String[] string = new String[0];
        if (line.equals(password)) {
            admin AdminPanel = new admin();
            admin.main(string);
        }
        else {
            CompClub compclub = new CompClub();
            CompClub.main(string);
        }
    }
    private static void extendSession() {
        Scanner scan = new Scanner(System.in);
        User user = getUser();
        System.out.print("For how long do you want to extend session: ");
        long hours = scan.nextLong();
        if (hours <= 0) {
            System.out.println("You can't use negative or null values");
            return;
        }
        Computer computer = user.getComputer();
        computer.setHours(user, computer.getHoursLeft()+hours);
    }

    private static User getUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type id of your account: ");
        int id = scan.nextInt();
        while (id < 0 && id >= users.size()) {
            System.out.printf("There is no user with id %v", id);
            id = scan.nextInt();
        }
        return users.get(Math.toIntExact(id));
    }

    private static void listComputers() {
        System.out.println("user | is vip | hours left");
        for (int i=0; i < computers.size(); i++) {
            System.out.println(computers.get(i));
        }
    }
}