package snackBar;

public class VendingMachine {

    private static int id = 0;
    public String name;

    public VendingMachine(String name) {
        this.id = id++;
        this.name = name;
    }

        public String getName() {
            return name;
        }

}