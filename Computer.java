public class Computer {
    private boolean isVip;
    private boolean isTaken;
    private User user;
    private int rentCost;
    private float hoursLeft;

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

    public void setHours(User user, int hours) {
        if (user.getMoney() < hours * this.rentCost) {
            System.out.println("Your money is not enough");
            return;
        }
        user.setMoney(user.getMoney() - hours * this.rentCost);
        this.hoursLeft = hours;
    }

    public float getHoursLeft() {
        return this.hoursLeft;
    } 

    public int getCost() {
        return this.rentCost;
    }
}
