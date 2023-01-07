package DefiningClassesExercise.Google_07;

public class Company {
    private String companyName;
    private String companyDepartment;
    private double companySalary;

    public Company(String companyName, String companyDepartment, double companySalary) {
        this.companyName = companyName;
        this.companyDepartment = companyDepartment;
        this.companySalary = companySalary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyDepartment() {
        return companyDepartment;
    }

    public double getCompanySalary() {
        return companySalary;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyDepartment(String companyDepartment) {
        this.companyDepartment = companyDepartment;
    }

    public void setCompanySalary(double companySalary) {
        this.companySalary = companySalary;
    }
    @Override
    public String toString(){
        return String.format("%s %s %.2f", companyName, companyDepartment, companySalary);

    }
}
