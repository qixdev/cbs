class User {
    public String nickname;
    private long money;
    private Computer computer;
    //private int id;

    User(String nickname) {
        this.nickname = nickname;
        //this.id = CompClub.users.size() + 1;
    }

    public void GiveMoney(long money) {
        this.money = this.money + money;
    }

    public String getName() {
        return this.nickname;
    }

    public void SetMoney(long money)
    {
        this.money = this.money;
    }
    public long getMoney() {
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
