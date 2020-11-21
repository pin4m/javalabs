package lab3.monitor;

/**
 * Created by Mixam on 11.11.2020.
 */


import lab3.type.Sex;
import lab3.type.Student;

public class SexMonitor {
    public static Sex sexChoose(String input) {

        input=input.toLowerCase();
        input=input.toUpperCase();

        Sex sex = Sex.MALE;

        if (input.equals("male")) {
            sex = Sex.MALE;

        } else if (input.equals("female")) {
            sex = Sex.FEMALE;

        }

        return sex;
    }
}