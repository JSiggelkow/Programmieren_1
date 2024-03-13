package übungsaufgaben.klassendiagramme;

import lerneinheiten.oop.FlashLight;

import java.util.ArrayList;

public class Company {
    private final String name;
    private final ArrayList<Employee> employees;
    private int numOfEmployees;

    public Company(String name) {
        this.name = name;
        employees = new ArrayList<>();
        numOfEmployees = employees.size();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        numOfEmployees++;
    }

    @Override
    public String toString() {
        String result = String.format("%s (%d Mitarbeiter)%n",name,numOfEmployees);
        for (Employee e : employees) {
            result += String.format("%s%n",e.toString());
        }
        return result;
    }
}
