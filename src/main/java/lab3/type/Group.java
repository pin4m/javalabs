package lab3.type;

/**
 * Created by pin4m on 11.11.2020.
 */

import java.util.ArrayList;

public class Group extends UniverBase {
    private ArrayList<Student> students;
    private String groupNumber;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupName) {
        this.groupNumber = groupName;
    }
}
