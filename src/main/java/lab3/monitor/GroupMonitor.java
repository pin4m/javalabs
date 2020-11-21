package lab3.monitor;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.type.Group;
import lab3.type.Student;
import lab3.kind.GroupKind;

import java.util.ArrayList;

public class GroupMonitor {
    private Group groupType;
    private GroupKind groupKind;

    public GroupMonitor(Group groupType, GroupKind groupKind){
        this.groupType = groupType;
        this.groupKind = groupKind;
    }

    public Group getGroupType() {
        return groupType;
    }

    public void setGroupType(Group groupType) {
        this.groupType = groupType;
    }

    public GroupKind getGroupKind() {
        return groupKind;
    }

    public void setGroupKind(GroupKind groupKind) {
        this.groupKind = groupKind;
    }

    public void updateGroupeKind(){
        groupKind.printGroupDetails(groupType.getGroupNumber(), groupType.getBoss(), groupType.getStudents());
    }
}
