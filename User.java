public class User {
    private String nickname;
    private int money;

    public void setName(String name) {
        this.nickname = name;
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
}
