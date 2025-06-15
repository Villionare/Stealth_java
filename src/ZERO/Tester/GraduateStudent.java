package ZERO.Tester;

class GraduateStudent extends Student {
    public GraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int average = getAverageScore();
        if (average >= 60) {
            setTestResult("Pass");
        } else {
            setTestResult("Fail");
        }
    }
}
