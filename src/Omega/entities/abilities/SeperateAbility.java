package Omega.entities.abilities;

import arc.util.Log;
import mindustry.entities.abilities.Ability;
import mindustry.gen.Unit;

public class SeperateAbility extends Ability {
    public void death(Unit unit) {
        Log.info("hegemon");
        for (int i = 0; i < 3; i++) {
            unit.type.spawn(unit.team, unit.x, unit.y);
        }
    }
}