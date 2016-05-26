package entity;

import entity.enums.EducationStage;
import entity.enums.Gender;
import entity.enums.QualificationLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 4:13 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Programmer extends Employee implements Cloneable{
    private List<String> projects;

    private QualificationLevel qualificationLevel;

    public Programmer() {
        projects = new ArrayList<>();
    }

    public Programmer(String lastName, String firstName, String patronymic, LocalDate birthDate, Gender gender,
                      EducationStage educationStage, long educationDocumentNumber, String educationInstitution,
                      LocalDate hireDate, Address homeAddress, List<String> projects,
                      QualificationLevel qualificationLevel) {
        super(lastName, firstName, patronymic, birthDate, gender, educationStage, educationDocumentNumber,
                educationInstitution, hireDate, homeAddress);
        this.projects = projects;
        this.qualificationLevel = qualificationLevel;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public QualificationLevel getQualificationLevel() {
        return qualificationLevel;
    }

    public void setQualificationLevel(QualificationLevel qualificationLevel) {
        this.qualificationLevel = qualificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Programmer that = (Programmer) o;

        if (projects != null ? !projects.equals(that.projects) : that.projects != null) return false;
        return qualificationLevel == that.qualificationLevel;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (projects != null ? projects.hashCode() : 0);
        result = 31 * result + (qualificationLevel != null ? qualificationLevel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "projects=" + projects +
                ", qualificationLevel=" + qualificationLevel +
                "} " + super.toString();
    }
}
