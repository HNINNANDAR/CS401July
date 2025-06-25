package lesson03.lecture.my_polymorphism;

public class Secretary extends StaffPerson{
    private int yearsOfService;

    public Secretary(String name, String address, String phoneNumber, int yearsOfService) {
        super(name, address, phoneNumber);
        this.yearsOfService = yearsOfService;
    }
    @Override
    public double computeStipend() {
        return 1300;
    }
    public int getYearsOfService() {
        return yearsOfService;
    }
    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
}
