/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradetracker;


import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class GradeTracker {

    static class StudentGrade {
    String name;
    double grade;

    StudentGrade(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<StudentGrade> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Grade Tracker ---");
            System.out.println("1. Add Student Grade");
            System.out.println("2. Display Average Grade");
            System.out.println("3. Display Highest and Lowest Grades");
            System.out.println("4. Exit");
            System.out.print("Enter a number: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    double grade = scanner.nextDouble();
                    grades.add(new StudentGrade(name, grade));
                    System.out.println("Grade added.");
                    break;
                case 2:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available.");
                    } else {
                        double total = 0;
                        for (StudentGrade sg : grades) {
                            total += sg.grade;
                        }
                        System.out.println("Average Grade: " + (total / grades.size()));
                    }
                    break;
                case 3:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available.");
                    } else {
                        double max = grades.get(0).grade;
                        double min = grades.get(0).grade;
                        for (StudentGrade sg : grades) {
                            if (sg.grade > max) max = sg.grade;
                            if (sg.grade < min) min = sg.grade;
                        }
                        System.out.println("Highest Grade: " + max);
                        System.out.println("Lowest Grade: " + min);
                    }
                    break;
                case 4:
                    System.out.println("Exiting Grade Tracker.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
    
}
