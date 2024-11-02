
import java.util.Scanner;

class Coffee {
    private String type;
    private double price;

    public Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coffee[] menu = {
                new Coffee("Espresso", 2.50),
                new Coffee("Latte", 3.50),
                new Coffee("Cappuccino", 3.00),
                new Coffee("Americano", 2.00)
        };

        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Here is our menu:");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getType() + " - $" + menu[i].getPrice());
        }

        System.out.print("Please enter the number of the coffee you want to order: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > menu.length) {
            System.out.println("Invalid choice. Please try again.");
        } else {
            Coffee selectedCoffee = menu[choice - 1];
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            double totalCost = selectedCoffee.getPrice() * quantity;
            System.out.println("You ordered " + quantity + " " + selectedCoffee.getType() + "(s).");
            System.out.println("Total cost: $" + totalCost);
        }

        scanner.close();
    }
}
