package snackBar;

public class VendingMachine {

    private static int id = 0;
    public String name;

    public VendingMachine(String name) {
        this.id = id++;
        this.name = name;
    }

        //Getters
        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        //Setters
        public void setName(String name) {
            this.name = name;
        }
        public void setId(int id) {
            this.id = id;
        }

}