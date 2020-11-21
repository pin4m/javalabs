package lab3.monitor;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.type.Department;
import lab3.type.Group;
import lab3.kind.DepartmentKind;

import java.util.ArrayList;

public class DepartmentMonitor {
    private Department departmentType;
    private DepartmentKind departmentKind;

    public DepartmentMonitor(Department departmentType, DepartmentKind departmentKind) {
        this.departmentType = departmentType;
        this.departmentKind = departmentKind;
    }

    public Department getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(Department departmentType) {
        this.departmentType = departmentType;
    }

    public DepartmentKind getDepartmentKind() {
        return departmentKind;
    }

    public void setDepartmentKind(DepartmentKind departmentKind) {
        this.departmentKind = departmentKind;
    }

    public void updateDepartmentKind() {
        departmentKind.printDepartmentDetails(departmentType.getDepartmentName(), departmentType.getBoss(), departmentType.getGroups());
    }
}