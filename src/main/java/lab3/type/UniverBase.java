package lab3.type;

/**
 * Created by pin4m on 11.11.2020.
 */

public abstract class UniverBase {

    public String univerName;
    Boss boss;

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

}

