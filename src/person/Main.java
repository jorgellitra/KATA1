package person;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person p1;
        p1 = new Person("jorge","quintana llitrá", new Date(94,8,15));
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
    }
}
