package snackBar;

public static void Customer {

    private static int id = 0;
    public int cash;
    public String name;

    public Customer(int cash, String name) {
        this.cash = cash;
        this.name = name;
    }
        //Getters
        public getCash() {
            return cash;
        }
        public getName() {
            return name;
        }

        //Setters
        public void setName(String name) {
            this.name = name;
        }

        //Methods
        public void addCash(int amount) {
            this.cash += amount;
        }
        public void payCash(int amount) {
            this.cash -= amount;
        }
}