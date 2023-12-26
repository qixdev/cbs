public class User {
    private String nickname;
    private int money;

    User(String nickname) {
        this.nickname = nickname;
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

    @Override
    public String toString() {
        return "Nickname: " + this.nickname + "\nBalance: " + this.money; 
    }
}
