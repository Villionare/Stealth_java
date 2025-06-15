package ZERO.Tester;

public class Student {
    protected String studentName;
    protected int[] testScores;
    protected String testResult;

    public String gettestResult() {
        return testResult;
    }

    public String getStudentName() {
        return studentName;
    }

    public int[] getTestScores() {
        return testScores;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    void generateResult(){}
}