package ZERO.Tester;

public class Validator {

    public boolean validateName(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        return true;
    }

    boolean validateJobProfile(String jobProfile) {
        return switch (jobProfile) {
            case "Associate" -> true;
            case "Clerk" -> true;
            case "Executive" -> true;
            case "Officer" -> true;
            default -> false;
        };
    }

    boolean validateAge(int age) {
        return age >= 18 && age <= 30;
    }

    void validate(Applicant applicant) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {

        if (!validateName(applicant.getName())) {
            throw new InvalidNameException("Invalid Name");
        }

        if (!validateJobProfile(applicant.getJobProfile())) {
            throw new InvalidJobProfileException("Invalid Job Profile");
        }

        if (!validateAge(applicant.getAge())) {
            throw new InvalidAgeException("Invalid Age");
        }
    }
}
