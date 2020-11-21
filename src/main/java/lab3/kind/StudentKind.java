package lab3.kind;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.Colours;
import lab3.type.Sex;

public class StudentKind {
    public void printStudentDetails (String name, String surname, String patronymic, int grade, Sex sex){
        System.out.println(Colours.ANSI_YELLOW+"\nName: " +name + " | Surname: " +surname + " | Patronymic: " +patronymic + " | Grade: " + grade + " | Sex: " + sex);
    }
}

