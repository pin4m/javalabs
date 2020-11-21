package lab3.kind;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.Colours;
import lab3.type.Faculty;

import java.util.ArrayList;

public class UniverKind {
    public void printUniverDetails(String univerName, String location, ArrayList<Faculty> faculties) {
        System.out.println(Colours.ANSI_YELLOW + "\nUniver: " + univerName + " | Location: " + location);

        // for (int i=0; i<faculties.size()-1; i++){
        //    System.out.println(faculties.get(i));
        //}
    }

}

