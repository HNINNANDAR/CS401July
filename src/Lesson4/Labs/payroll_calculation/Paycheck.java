package Lesson4.Labs.payroll_calculation;

public class Paycheck {
    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public double getNetPay(){
        return grossPay - (fica + state + local + socialSecurity);
    }

    public void print(){
        System.out.printf("Gross Pay: %.2f\n" , grossPay);
        System.out.printf("Fica: %.2f\n" , fica);
        System.out.printf("State: %.2f\n" , state);
        System.out.printf("Local: %.2f\n" , local);
        System.out.printf("Social Security: %.2f\n" , socialSecurity);
        System.out.printf("Medicare: %.2f\n" , medicare);
        System.out.printf("Net Pay: %.2f\n" , getNetPay());
    }
}
