package lab3.type;

/**
 * Created by pin4m on 11.11.2020.
 */

import java.util.ArrayList;

public class Department extends UniverBase {
    private ArrayList<Group> groups;
    private String departmentName;

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
