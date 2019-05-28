package snackBar;

public class Customer {

    private static int id = 0;
    public double cash;
    public String name;

    public Customer(double cash, String name) {
        this.cash = cash;
        this.name = name;
    }
        //Getters
        public double getCash() {
            return cash;
        }
        public String getName() {
            return name;
        }

        //Setters
        public void setName(String name) {
            this.name = name;
        }

        //Methods
        public void addCash(double amount) {
            this.cash += amount;
        }
        public void payCash(double amount) {
            this.cash -= amount;
        }
}