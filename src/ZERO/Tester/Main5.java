package ZERO.Tester;

public class Main5 {


    public static void main(String[] args) {

        try {
            Applicant applicant= new Applicant();
            applicant.setName("Jenny");
            applicant.setJobProfile("Clerk");
            applicant.setAge(25);

            Validator validator = new Validator();

            validator.validate(applicant);
            System.out.println("Application submitted successfully!");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }

