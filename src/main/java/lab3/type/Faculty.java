package lab3.type;

/**
 * Created by pin4m on 11.11.2020.
 */

import java.util.ArrayList;

public class Faculty extends UniverBase {
    public ArrayList<Department> departments;
    private String facultyName;

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
