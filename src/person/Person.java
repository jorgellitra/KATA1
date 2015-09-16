/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Person {
    private final String name;
    private final String surname;
    private final Date birthday;
    private static final long MILLISECOND_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public String getFullName(){
        return name + ' ' + surname;
    }
    
    public double getAge(){
        Date today = new Date();
        return (int) getMillis(today.getTime()-birthday.getTime());
    }
    
    private long getMillis(long milli){
        return milli/MILLISECOND_PER_YEAR;
    }
}
