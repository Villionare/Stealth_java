package ZERO.Tester;

public class Teacher extends Faculty{
    protected String qualification;

    public Teacher(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.qualification = designation;
    }

    protected double calculateSalary(float basicSalary, float carAllowancePercentage, float bonusPercentage){
        //this is the main area where we will calculate the salary by using the designation
        return basicSalary + basicSalary * carAllowancePercentage/100 + basicSalary * bonusPercentage;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
