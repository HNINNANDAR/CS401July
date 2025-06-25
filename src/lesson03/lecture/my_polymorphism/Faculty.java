package lesson03.lecture.my_polymorphism;

public class Faculty extends StaffPerson{
    private String title;

    public Faculty(String name, String adress, String phoneNumber, String title) {
        super(name, adress, phoneNumber);
        this.title = title;
    }
    @Override
    public double computeStipend() {
        return 1500;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
