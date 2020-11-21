package lab3.kind;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.Colours;
import lab3.type.Boss;
import lab3.type.Department;

import java.util.ArrayList;

public class FacultyKind {
    public void printFacultyDetails (String facultyname, Boss boss, ArrayList<Department> department){
        System.out.println(Colours.ANSI_YELLOW+"\nFaculty name: " +facultyname);

        // for (int i=0; i<department.size()-1; i++){
        // System.out.println(department.get(i));
        //}
    }
}
