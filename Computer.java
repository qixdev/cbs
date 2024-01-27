class Computer {
    private boolean isVip;
    private boolean isTaken;
    private User user;
    private int rentCost;
    private long hoursLeft;

    Computer(User user, boolean isVip, long hours) {
        setVip(isVip);
        setHours(user, hours);
        if (getHoursLeft() == 0) {
            System.out.println("Your booking was canceled");
            return;
        }
        user.setComputer(this);
    }

    public void setVip(boolean isVip) {
        this.isVip = isVip;
        if (isVip) {
            rentCost = 1000;
        } else {
            rentCost = 500;
        }
    }

    public void setTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public void setHours(User user, long hours) {
        if (user.getMoney() < hours * this.rentCost) {
            System.out.println("Your money is not enough");
            return;
        }
        setTaken(true);
        setUser(user);
        user.setMoney(user.getMoney() - hours * this.rentCost);
        this.hoursLeft = hours;
    }

    public long getHoursLeft() {
        return this.hoursLeft;
    }

    public long getCost() {
        return this.rentCost;
    }

    @Override
    public String toString() {
        if (isTaken) {
            return user.getName() + " " + isVip + " " + hoursLeft;
        }
        return "free " + isVip;
    }
}
