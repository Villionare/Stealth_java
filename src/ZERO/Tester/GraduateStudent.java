package ZERO.Tester;

class GraduateStudent {

    //user
    private int id;
    private String emailId;
    private String userName;
    protected double walletBalance;

    public GraduateStudent(int id, String emailId, String userName, double walletBalance) {
        this.id = id;
        this.emailId = emailId;
        this.userName = userName;
        this.walletBalance = walletBalance;
    }

    protected boolean makePayment(double billAmount){
        double left_balance = this.walletBalance - billAmount;
        return left_balance > 0;
    }

    public int getId() {
        return id;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getUserName() {
        return userName;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}