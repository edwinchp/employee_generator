package org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Methods {

    private static Scanner userInput;
    private static List<String> names = new ArrayList<String>();
    private static List<String> lastNames = new ArrayList<String>();


    public static void start() {

        names.add("Edwin");
        names.add("Mildred");
        names.add("Josue");
        names.add("Maria");
        names.add("Joaquin");

        lastNames.add("Chi");
        lastNames.add("Manrique");
        lastNames.add("Perez");
        lastNames.add("Cohuo");
        lastNames.add("Azcorra");

        System.out.println("**************************");
        System.out.println("*********Welcome**********");
        System.out.println("**************************");
        System.out.println("Press 1 to generate an employee");
        System.out.println("Press 2 to see all employees");
        System.out.println("Press 3 to exit");
        System.out.println("**************************");

        requestUserInput();
    }

    public static void requestUserInput() {
        userInput = new Scanner(System.in);
        int option = Integer.parseInt(userInput.nextLine());
        while (option != 3) {
            userInput = new Scanner(System.in);
            option = Integer.parseInt(userInput.nextLine());
            switch (option) {
                case 1:
                    System.out.println("How many employees do you want to create?");
                    Scanner noOfEmployees = new Scanner(System.in);
                    int no = noOfEmployees.nextInt();
                    for (int i = 0; i < no; i++) {
                        generateEmployee();
                    }
                    System.out.println("Done! " + no + " new employees created");
                    break;

                case 2:
                    seeAllEmployees();
                    break;

                case 3:
                    exit();
                    break;

                default:
                    System.out.println("Command not recognized. Please try again.");
            }
        }
    }

    private static void seeAllEmployees() {
        if (Employee.getEmployees().size() < 1) {
            System.out.println("No employees registered yet.");
            return;
        }
        for (Employee employee : Employee.getEmployees()) {
            System.out.println(employee.getId() + ". " + employee);
        }
    }

    private static void generateEmployee() {
        Random r = new Random();
        Random r2 = new Random();
        int nameRandomNo = r.nextInt(names.size());
        int lastNameRandomNo = r2.nextInt(lastNames.size());

        String chosenName = names.get(nameRandomNo);
        String chosenLastName = lastNames.get(lastNameRandomNo);
        String email = chosenName + "." + chosenLastName + "@gmail.com";
        Employee employee = new Employee(chosenName, chosenLastName, email);
        Employee.addEmployee(employee);
    }

    public static void exit() {

    }

}
