package ZERO.Tester;

class UndergraduateStudent extends Student {
    public UndergraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int average = getAverageScore();
        if (average >= 50) {
            setTestResult("Pass");
        } else {
            setTestResult("Fail");
        }
    }
}