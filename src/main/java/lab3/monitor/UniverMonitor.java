package lab3.monitor;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.type.Faculty;
import lab3.type.Univer;
import lab3.kind.UniverKind;

import java.util.ArrayList;

public class UniverMonitor {
    private Univer univerType;
    private UniverKind univerKind;

    public UniverMonitor(Univer univerType, UniverKind univerKind) {
        this.univerType = univerType;
        this.univerKind = univerKind;
    }

    public Univer getUniverType() {
        return univerType;
    }

    public void setUniverType(Univer univerType) {
        this.univerType = univerType;
    }

    public UniverKind getUniverKind() {
        return univerKind;
    }

    public void setUniverKind(UniverKind univerKind) {
        this.univerKind = univerKind;
    }

    public void updateUniverKind() {
        univerKind.printUniverDetails(univerType.getUniverName(), univerType.getLocation(), univerType.getFaculties());
    }
}
