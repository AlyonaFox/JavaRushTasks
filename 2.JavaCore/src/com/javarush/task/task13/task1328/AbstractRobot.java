package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable {
    protected String name;
    public String getName() {
        return this.name;
    }

    private static int hitCount;
    private static int defCount;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
            return attackedBodyPart;
        }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        defCount = defCount + 1;

        if (defCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (defCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (defCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else if (defCount == 4) {
            defCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}
