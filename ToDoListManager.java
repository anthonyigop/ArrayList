/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package to.dolistmanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ToDoListManager {

    static class Task {

        String description;

        Task(String description) {
            this.description = description;
        }

        void display() {
            System.out.println(description);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- To-Do List Manager ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter a number: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String description = scanner.nextLine();
                    tasks.add(new Task(description));
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.print("Enter the index of the task to remove: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.print(i + ". ");
                        tasks.get(i).display();
                    }
                    break;
                case 4:
                    System.out.println("Exiting To-Do List Manager.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();

    }

}
