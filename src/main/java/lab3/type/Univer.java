package lab3.type;

/**
 * Created by pin4m on 11.11.2020.
 */

import java.util.ArrayList;

public class Univer extends UniverBase {

    public ArrayList<Faculty> faculties;
    public String location;

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}