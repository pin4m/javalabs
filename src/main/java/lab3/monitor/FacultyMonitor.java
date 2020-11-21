package lab3.monitor;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.type.Department;
import lab3.type.Faculty;
import lab3.kind.FacultyKind;

import java.util.ArrayList;

public class FacultyMonitor {

    private Faculty facultyType;
    private FacultyKind facultyKind;

    public FacultyMonitor(Faculty facultyType, FacultyKind facultyKind) {
        this.facultyType = facultyType;
        this.facultyKind = facultyKind;
    }

    public Faculty getFacultyType() {
        return facultyType;
    }

    public void setFacultyType(Faculty facultyType) {
        this.facultyType = facultyType;
    }

    public FacultyKind getFacultyKind() {
        return facultyKind;
    }

    public void setFacultyKind(FacultyKind facultyKind) {
        this.facultyKind = facultyKind;
    }

    public void updateFacultyKind(){
        facultyKind.printFacultyDetails(facultyType.getFacultyName(), facultyType.getBoss(), facultyType.getDepartments());
    }
}
