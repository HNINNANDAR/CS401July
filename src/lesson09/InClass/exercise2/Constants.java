package lesson09.InClass.exercise2;

public enum Constants {
    COMPANY("Microsoft"), SALES_REPORT(1000000);
    private String companyName;
    private int sales_report;
    Constants(String companyName){
        this.companyName = companyName;
    }
    Constants(int sales_report){
        this.sales_report = sales_report;
    }
    public String getCompanyName() {
        return companyName;
    }
    public int getSales_report() {
        return sales_report;
    }
    //if setter is set up, this enum is going to be immutable
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSales_report(int sales_report) {
        this.sales_report = sales_report;
    }
}
