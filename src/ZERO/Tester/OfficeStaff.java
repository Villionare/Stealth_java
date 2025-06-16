package ZERO.Tester;

public class OfficeStaff extends Faculty{
    protected String designation;

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    protected double calculateSalary(float basicSalary, float carAllowancePercentage, float bonusPercentage){
        //this is the main area where we will calculate the salary by using the designation
            return basicSalary + basicSalary * carAllowancePercentage/100 + basicSalary * bonusPercentage;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
