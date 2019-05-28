package snackBar;

public static void Snack {

    private static int id = 0;
    public String name;
    public int quantity;
    public double cost;
    public int machineId;

    public Snack(String name, int quantity, double cost, int machineId) {
        this.id = id++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

        //Getters
        public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public int getQuantity() {
            return quantity;
        }
        public double getCost() {
            return cost;
        }
        public int getMachineId() {
            return machineId;
        }

        //Setters
        public void setName(String name) {
            this.name = name;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void setCost(double cost) {
            this.cost = cost;
        }
        public void setMachineId(int machineId){
            this.machineId=machineId;
        }

        //Methods
        public void addQuantity(int amount) {
            this.quantity += amount
        }
        public void buySnack(int amount) {
            this.quantity -= amount
        }
        public void totalCost(int quantity) {
            return this.cost * quantity
        }

}