import org.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Edwin");
        names.add("Mildred");
        names.add("Josue");
        names.add("Maria");
        names.add("Joaquin");

        List<String> lastNames = new ArrayList<String>();
        lastNames.add("Chi");
        lastNames.add("Manrique");
        lastNames.add("Perez");
        lastNames.add("Cohuo");
        lastNames.add("Azcorra");





        List<Employee> employees = new ArrayList<Employee>();

        for (int i = 0; i < 10; i++) {

            // Random number based on names / lastNames size
            Random r = new Random();
            int nameRandomNo = r.nextInt(names.size());
            int lastNameRandomNo = r.nextInt(lastNames.size());

            String chosenName = names.get(nameRandomNo);
            String chosenLastName = lastNames.get(lastNameRandomNo);
            String email = chosenName + "." + chosenLastName + "@gmail.com";
            Employee employee = new Employee(chosenName, chosenLastName, email);
            employees.add(employee);
        }

        System.out.println("employees = " + employees.toString());

    }
}