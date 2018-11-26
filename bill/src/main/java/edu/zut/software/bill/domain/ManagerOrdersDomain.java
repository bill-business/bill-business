package edu.zut.software.bill.domain;

public class ManagerOrdersDomain {


    private String OCompany;
    private String CCompany;
    private int Money;
    private String ExpirationTime;
    private String DeductExpenses;
    private boolean Defects;
    private String EndorTime;


    public String getOCompany() {
        return OCompany;
    }

    public void setOCompany(String OCompany) {
        this.OCompany = OCompany;
    }

    public String getCCompany() {
        return CCompany;
    }

    public void setCCompany(String CCompany) {
        this.CCompany = CCompany;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public String getExpirationTime() {
        return ExpirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        ExpirationTime = expirationTime;
    }

    public String getDeductExpenses() {
        return DeductExpenses;
    }

    public void setDeductExpenses(String deductExpenses) {
        DeductExpenses = deductExpenses;
    }

    public boolean isDefects() {
        return Defects;
    }

    public void setDefects(boolean defects) {
        Defects = defects;
    }

    public String getEndorTime() {
        return EndorTime;
    }

    public void setEndorTime(String endorTime) {
        EndorTime = endorTime;
    }
}
