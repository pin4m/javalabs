package lab3.kind;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.Colours;
import lab3.type.Boss;
import lab3.type.Student;
import java.util.ArrayList;

public class GroupKind {
    public void printGroupDetails (String groupNumber, Boss boss, ArrayList<Student> students){
        System.out.println(Colours.ANSI_YELLOW+"\nGroup: " + groupNumber);
        //for (Student person : students){
        //    System.out.println(person);
        //}
    }
}
