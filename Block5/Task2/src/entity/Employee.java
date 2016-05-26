package entity;

import entity.enums.EducationStage;
import entity.enums.Gender;

import java.time.LocalDate;

/**
 * Created on 15:16 23.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public abstract class Employee implements Cloneable {
    private String lastName;

    private String firstName;

    private String patronymic;

    private LocalDate birthDate;

    private Gender gender;

    private EducationStage educationStage;

    private long educationDocumentNumber;

    private String educationInstitution;

    private LocalDate hireDate;

    private Address homeAddress;

    public Employee() {
    }

    public Employee(String lastName, String firstName, String patronymic, LocalDate birthDate, Gender gender,
                    EducationStage educationStage, long educationDocumentNumber, String educationInstitution,
                    LocalDate hireDate, Address homeAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.gender = gender;
        this.educationStage = educationStage;
        this.educationDocumentNumber = educationDocumentNumber;
        this.educationInstitution = educationInstitution;
        this.hireDate = hireDate;
        this.homeAddress = homeAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public EducationStage getEducationStage() {
        return educationStage;
    }

    public void setEducationStage(EducationStage educationStage) {
        this.educationStage = educationStage;
    }

    public long getEducationDocumentNumber() {
        return educationDocumentNumber;
    }

    public void setEducationDocumentNumber(long educationDocumentNumber) {
        this.educationDocumentNumber = educationDocumentNumber;
    }

    public String getEducationInstitution() {
        return educationInstitution;
    }

    public void setEducationInstitution(String educationInstitution) {
        this.educationInstitution = educationInstitution;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public Employee clone() {
        try {
            Employee employee = (Employee) super.clone();
            employee.lastName = lastName;
            employee.firstName = firstName;
            employee.patronymic = patronymic;
            employee.birthDate = LocalDate.from(birthDate);
            employee.gender = gender;
            employee.educationStage = educationStage;
            employee.educationDocumentNumber = educationDocumentNumber;
            employee.educationInstitution = educationInstitution;
            employee.hireDate = LocalDate.from(hireDate);
            employee.homeAddress.clone();
            return employee;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;

        if (getClass() == o.getClass()) {
            Employee employee = (Employee) o;

            if (educationDocumentNumber != employee.educationDocumentNumber)
                return false;

            if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
            if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
            if (patronymic != null ? !patronymic.equals(employee.patronymic) : employee.patronymic != null)
                return false;
            if (birthDate != null ? !birthDate.equals(employee.birthDate) : employee.birthDate != null) return false;
            if (gender != employee.gender) return false;
            if (educationStage != employee.educationStage) return false;
            if (educationInstitution != null ? !educationInstitution.equals(employee.educationInstitution) :
                    employee.educationInstitution != null)
                return false;
            if (hireDate != null ? !hireDate.equals(employee.hireDate) : employee.hireDate != null) return false;
            return homeAddress != null ? homeAddress.equals(employee.homeAddress) : employee.homeAddress == null;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (educationStage != null ? educationStage.hashCode() : 0);
        result = 31 * result + (int) (educationDocumentNumber ^ (educationDocumentNumber >>> 32));
        result = 31 * result + (educationInstitution != null ? educationInstitution.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        result = 31 * result + (homeAddress != null ? homeAddress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", educationStage=" + educationStage +
                ", educationDocumentNumber=" + educationDocumentNumber +
                ", educationInstitution='" + educationInstitution + '\'' +
                ", hireDate=" + hireDate +
                ", homeAddress=" + homeAddress +
                '}';
    }
}
