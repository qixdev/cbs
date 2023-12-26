public class User {
    private String nickname;
    private int money;
    private Computer computer;
   // private int id;

    User(String nickname) {
        this.nickname = nickname;
        //this.id = CompClub.users.size() + 1;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return this.nickname;
    }
    
    public int getMoney() {
        return this.money;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return this.computer;
    }

    @Override
    public String toString() {
        return this.nickname + " " + this.money; 
    }
}
