package lab3.kind;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.Colours;
import lab3.type.Sex;

public class BossKind {
    public void printBossDetails (String name, String surname, String patronymic, Sex sex, String areaControl){
        System.out.println(Colours.ANSI_YELLOW+"\nName: " +name + " | Surname: " +surname + " | Patronymic: " +patronymic + " | Sex: " + sex + "| Area control: " + areaControl);
    }
}

