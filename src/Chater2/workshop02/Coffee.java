package Chater2.workshop02;

public class Coffee {
    private String shopName;
    private String menu;
    private int income;

    public Coffee() {}

    public Coffee(String shopName, String menu, int income) {
        this.shopName = shopName;
        this.menu = menu;
        this.income = income;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
