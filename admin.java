import java.util.ArrayList;
import java.util.Scanner;

public class admin {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Computer> computers = new ArrayList<>();
    static ArrayList<CompClub> compclub = new ArrayList<>();
    static ArrayList<HLTVuser> hltv = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        loop: while (true) {
            PrintAdminOptions();
            String option = scanf.nextLine();
            switch (option) {
                case "1":
                    SetMoney();
                    break;
                case "2":
                    ComputerControl();
                    break;
                case "3":
                    UserControl();
                    break;
                case "4":
                    ChangeUserType();
                    break;
                case "exit":
                    scanf.close();
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
            scanf.close();
        }
    }

    private static void PrintAdminOptions() {
        System.out.println();
        System.out.println("Select operation:");
        System.out.println("1 - Set money for user");
        System.out.println("2 - Set hours on the computer");
        System.out.println("3 - Change nickname for user");
        System.out.println("4 - Set HLTV users");
        System.out.println("exit - to exit");
        System.out.println();
        System.out.print("input: ");
    }

    private static void UserControl() {
        User user = getUser();
        System.out.println(user.getName());
        System.out.println("Write down new username");
        Scanner scan = new Scanner(System.in);
                String nickname = scan.nextLine();
        user.nickname = nickname;
        System.out.println(user.getName());
        System.out.println("This is new username");
    }

    private static void ComputerControl() {
        User user = getUser();
        Scanner scan = new Scanner(System.in);
                int hours = scan.nextInt();
        Computer computer = user.getComputer();
        computer.setHours(user, hours);
    }

    private static void SetMoney() {
        Scanner scan = new Scanner(System.in);
        User user = getUser();
        System.out.print("How much money you want to add: ");
        long money = scan.nextLong();
        if (money <= 0) {
            System.out.println("You can't add negative or null values to balance");
            return;
        }
        user.SetMoney(money);
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
    private static void ChangeUserType() {
        User user = getUser();
        HLTVuser hltv = new HLTVuser(null, null);
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        String Yes = "Yes";
        System.out.print("Do you want to give this user permission of hltv user?Type: Yes or No");
        if(answer.equals(Yes))
        {
            Scanner scanf = new Scanner(System.in);
            String link = scanf.nextLine();
            System.out.print("Write the link below:");
            hltv.changeLink(link);
        }
    }
}
