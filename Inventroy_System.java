/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventroy_system;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Inventroy_System {

    static class Item {
    String name;
    int quantity;

    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Item: " + name + ", Quantity: " + quantity);
    }
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Item> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Inventory System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Update Stock");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter a number: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.add(new Item(name, quantity));
                    System.out.println("Item added.");
                    break;
                case 2:
                    System.out.print("Enter the index of the item to update: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < inventory.size()) {
                        System.out.print("Enter the new quantity: ");
                        inventory.get(index).quantity = scanner.nextInt();
                        System.out.println("Stock updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.println("Inventory:");
                    for (int i = 0; i < inventory.size(); i++) {
                        System.out.print(i + ". ");
                        inventory.get(i).display();
                    }
                    break;
                case 4:
                    System.out.println("Exiting Inventory System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    
    }
    
}
