/**
 * Created by pin4m on 19.11.2020.
 */

import lab3.BottomCreate;
import lab4.JsonManager;
import lab3.type.Sex;
import lab3.type.Univer;
import com.google.gson.Gson
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TryTest {

    private static JsonManager jsonManager;
    private static String defaultPath;

    @BeforeAll
    static void init() {
        jsonManager = JsonManager.getInstance();
        defaultPath = ".\src\test\java\univernow.json";
    }

    @AfterAll
    static void cleanUp() {
        jsonManager = null;
        defaultPath = null;
    }

    @Test
    public void checkUniverEquals() throws IOException {
        BottomCreate bottomCreate = new BottomCreate();
        jsonManager.setSerializable(
                bottomCreate
                        .createUniver("NTUDP")
                        .setUniverHoncho("Steve", "Michael", "Lothus", Sex.MALE)
                        .createFaculty("Apple Analysis and System Business")
                        .setFacultyHoncho("Maria", "Natalie", "Cluskie", Sex.FEMALE)
                        .createDepartment("Pinapple Analysis and System Soft Business")
                        .setDepartmentHoncho("Woz", "Avenue", "Fitzgerald", Sex.MALE)
                        .createGroup("BSTCRTR")
                        .setGroupHoncho("Kangoo", "Rutan", "Klipse", Sex.MALE)
                        .createStudent("Boy", "Man", "Uncle", Sex.MALE)
                        .createStudent("Girl", "Woman", "Aunt", Sex.FEMALE)
                        .createStudent("Himme", "Busker", "Kateriner", Sex.MALE).compose());

        jsonManager.convertToJson(defaultPath);

        Assertions.assertEquals(jsonManager.getFromJson(defaultPath, Univer.class), bottomCreate.compose());
    }
}