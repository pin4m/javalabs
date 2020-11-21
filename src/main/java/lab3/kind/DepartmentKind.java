package lab3.kind;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.Colours;
import lab3.type.Group;
import lab3.type.Boss;

import java.util.ArrayList;

public class DepartmentKind {
    public void printDepartmentDetails(String departmentName, Boss boss, ArrayList<Group> groups) {
        System.out.println(Colours.ANSI_YELLOW + "\nDepartment: " + departmentName);
        // for (int i=0; i<groups.size()-1; i++){
        // System.out.println(groups.get(i));
        //}
    }
}
