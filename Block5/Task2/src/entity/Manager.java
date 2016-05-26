package entity;

import entity.enums.EducationStage;
import entity.enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 4:13 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Manager extends Employee implements Cloneable {
    private List<Employee> employees;

    public Manager() {
        employees = new ArrayList<>();
    }

    public Manager(String lastName, String firstName, String patronymic, LocalDate birthDate, Gender gender,
                   EducationStage educationStage, long educationDocumentNumber, String educationInstitution,
                   LocalDate hireDate, Address homeAddress, List<Employee> employees) {
        super(lastName, firstName, patronymic, birthDate, gender, educationStage, educationDocumentNumber,
                educationInstitution, hireDate, homeAddress);
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Manager clone() {
        Manager manager = (Manager) super.clone();
        if (employees != null) {
            manager.employees = new ArrayList<>(employees.size());
            for (Employee employee : employees) {
                manager.employees.add(employee.clone());
            }
        }
        return manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return employees != null ? employees.equals(manager.employees) : manager.employees == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (employees != null ? employees.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employees=" + employees +
                "} " + super.toString();
    }
}
