package lab3.monitor;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.type.Boss;
import lab3.kind.BossKind;

public class BossMonitor {
    private Boss bossType;
    private BossKind bossKind;

    public BossMonitor(Boss bossType, BossKind bossKind) {
        this.bossType = bossType;
        this.bossKind = bossKind;
    }

    public Boss getBossType() {
        return bossType;
    }

    public void setBossType(Boss bossType) {
        this.bossType = bossType;
    }

    public BossKind getBossKind() {
        return bossKind;
    }

    public void setBossKind(BossKind bossKind) {
        this.bossKind = bossKind;
    }

    public void updateBossKind() {
        bossKind.printBossDetails(bossType.getName(), bossType.getSurname(), bossType.getPatronymic(), bossType.getSex(), bossType.getAreaControl());
    }
}