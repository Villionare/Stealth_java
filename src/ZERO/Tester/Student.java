package ZERO.Tester;

abstract class Student {
    private String studentName;
    private int[] testScores = new int[4];
    private String testResult;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setTestScore(int testNumber, int testScore) {
        if (testNumber >= 0 && testNumber < 4) {
            testScores[testNumber] = testScore;
        }
    }

    public int getTestScore(int testNumber) {
        return testScores[testNumber];
    }

    public String getTestResult() {
        return testResult;
    }

    protected void setTestResult(String result) {
        this.testResult = result;
    }

    protected int getAverageScore() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        return sum / testScores.length;
    }

    public abstract void generateResult();
}
