package snackBar;

public class Main {
    private static void performOps() {
        //Customers
        Customer c1 = new Customer(45.25, "Peggy Hill");
        Customer c2 = new Customer(33.14, "Hank Hill");

        //Snacks
        Snack s1 = new Snack("Chips", 36, 1.75, 0);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 0);
        Snack s3 = new Snack("Pretzel", 30, 2.00, 0);
        Snack s4 = new Snack("Soda", 24, 2.50, 2);
        Snack s5 = new Snack("Water", 20, 2.75, 2);

        //Machines
        VendingMachine food = new VendingMachine("Frito Lay");
        VendingMachine office = new VendingMachine("Quik Office");
        VendingMachine drink = new VendingMachine("Coca-Cola");

        //1
        c1.payCash(s4.totalCost(3));
        s4.buySnack(3);
        System.out.println();
        System.out.println(c1.getName() + " bought 3 " + s4.getName() + ".");
        System.out.println(c1.getName() + " has " + c1.getCash() + " dollars.");
        System.out.println("There are " + s4.getQuantity() + " " + s4.getName() + " left.");

        System.out.println();
        System.out.println("#########################");
        System.out.println();

        //2
        c1.payCash(s3.totalCost(1));
        s3.buySnack(1);
        System.out.println(c1.getName() + " bought 3 " + s3.getName() + ".");
        System.out.println(c1.getName() + " has " + c1.getCash() + " dollars.");
        System.out.println("There are " + s3.getQuantity() + " " + s3.getName() + " left.");

        System.out.println();
        System.out.println("#########################");
        System.out.println();

        //3
        c2.payCash(s4.totalCost(2));
        s4.buySnack(2);
        System.out.println(c2.getName() + " bought 3 " + s4.getName() + ".");
        System.out.println(c2.getName() + " has " + c2.getCash() + " dollars.");
        System.out.println("There are " + s4.getQuantity() + " " + s4.getName() + " left.");

        System.out.println();
        System.out.println("#########################");
        System.out.println();

        //4
        c1.addCash(10.0);
        System.out.println(c1.getName() + " has " + c1.getCash() + " dollars.");

        System.out.println();
        System.out.println("#########################");
        System.out.println();

        //5
        c1.payCash(s2.totalCost(1));
        s2.buySnack(1);
        System.out.println(c1.getName() + " bought 3 " + s2.getName() + ".");
        System.out.println(c1.getName() + " has " + c1.getCash() + " dollars.");
        System.out.println("There are " + s2.getQuantity() + " " + s2.getName() + " left.");

        System.out.println();
        System.out.println("#########################");
        System.out.println();

        //6
        s3.addQuantity(15);
        System.out.println("15 " + s3.getName() + " added to the machine.");
        System.out.println("There are " + s3.getQuantity() + " " + s3.getName() + " left.");
        System.out.println();

        System.out.println();
        System.out.println("#########################");
        System.out.println();

        //7
        c2.payCash(s3.totalCost(3));
        s3.buySnack(3);
        System.out.println(c2.getName() + " bought 3 " + s3.getName() + ".");
        System.out.println(c2.getName() + " has " + c2.getCash() + " dollars.");
        System.out.println("There are " + s3.getQuantity() + " " + s3.getName() + " left.");
        System.out.println();

        System.out.println();
        System.out.println("#########################");
        System.out.println();

        //Stretch
        System.out.println("Inventory Report:");
        System.out.println("-------------------------");
        System.out.println("There are " + s1.getQuantity() + " " + s1.getName() + " left in " + food.getName() + " that is worth " + "$" + s1.totalCost(s1.getQuantity()) + ".");
        System.out.println("There are " + s2.getQuantity() + " " + s2.getName() + " left in " + food.getName() + " that is worth " + "$" + s2.totalCost(s2.getQuantity()) + ".");
        System.out.println("There are " + s3.getQuantity() + " " + s3.getName() + " left in " + food.getName() + " that is worth " + "$" + s3.totalCost(s3.getQuantity()) + ".");
        System.out.println("There are " + s4.getQuantity() + " " + s4.getName() + " left in " + drink.getName() + " that is worth " + "$" + s4.totalCost(s4.getQuantity()) + ".");
        System.out.println("There are " + s5.getQuantity() + " " + s5.getName() + " left in " + drink.getName() + " that is worth " + "$" + s5.totalCost(s5.getQuantity()) + ".");

    }

    public static void main(String[] args) {
        performOps();
    }
}