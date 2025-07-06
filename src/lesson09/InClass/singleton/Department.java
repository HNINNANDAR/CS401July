package lesson09.InClass.singleton;

public enum Department {
    COMPRO;
    private Department(){}

    public void displayDepartment(){
        System.out.println("Department: " + name());
    }
}
class MyDepartment{
    public static MyDepartment myDepartment;
    public static MyDepartment getInstance(){
        if(myDepartment == null)
            myDepartment= new MyDepartment();
        return myDepartment;

    }
}
class Main{
    public static void main(String[] args) {
        Department department = Department.COMPRO;
        department.displayDepartment();
        System.out.println(Department.values());
    }
}
//singleton - only one department
