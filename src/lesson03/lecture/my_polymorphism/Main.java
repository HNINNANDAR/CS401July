package lesson03.lecture.my_polymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args){
        StaffPerson[] people = {
                new Faculty("Nandar","3000 East","32323","TRACK"),
                new Secretary("Zaw","5000 East","32323",4)
        };
        List<StaffPerson> people1 = List.of(
                new Faculty("Nandar","3000 East","32323","TRACK"),
                new Secretary("Zaw","5000 East","32323",4)
        ); //this is immutable list
        //use new ArrayList<>() if want to change the list
        for(StaffPerson person: people){
            if(person instanceof Faculty faculty){
//                Faculty faculty = (Faculty) person;
                System.out.println(faculty.getName() + " " + faculty.getAddress() + " " + faculty.getPhoneNumber() +" "+faculty.getTitle());
            }
            if(person instanceof Secretary secretary){
                System.out.println(secretary.getName()+" "+secretary.getAddress() +" " +secretary.getPhoneNumber() + secretary.getYearsOfService());
            }
        }
        double sum = 0.0;
        for(StaffPerson person: people){
            sum += person.computeStipend();
        }
    }
}
