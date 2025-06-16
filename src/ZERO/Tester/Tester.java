package ZERO.Tester;

class Tester {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
        OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");

        System.out.println("Teacher Details\n***************");
        System.out.println("Name: "+teacher.getName());
        System.out.println("Qualification: "+teacher.getQualification());
        System.out.println("Total salary: $" + Math.round(teacher.calculateSalary(teacher.basicSalary, teacher.carAllowancePercentage, teacher.bonusPercentage)*100)/100.0);
        System.out.println();

        System.out.println("Office Staff Details\n***************");
        System.out.println("Name: "+officeStaff.getName());
        System.out.println("Designation: "+officeStaff.getDesignation());
        System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary(officeStaff.basicSalary, officeStaff.carAllowancePercentage, officeStaff.bonusPercentage)*100)/100.0);

        //Create more objects for testing your code

    }
}
