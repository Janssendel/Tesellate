package Omega.content;

import Omega.entities.abilities.SeperateAbility;
import Omega.entities.units.OmegaUnitEntity;
import Omega.entities.units.OmegaUnitType;
import arc.func.Prov;
import arc.struct.ObjectMap.Entry;
import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.gen.EntityMapping;
import mindustry.gen.Entityc;
import mindustry.type.ammo.ItemAmmoType;

import static mindustry.content.UnitTypes.flare;
import static mindustry.world.meta.Stat.abilities;

public class OmegaUnits implements ContentList{
    //Steal from BetaMindy
    private static Entry<Class<? extends Entityc>, Prov<? extends Entityc>>[] types = new Entry[]{
            prov(OmegaUnitEntity.class, OmegaUnitEntity::new),};

    public static OmegaUnitType
        tesseract, facet, dextral_shard, sinitral_shard, aspect;

        EntityMapping.nameMap.put("tesseract", OmegaUnitEntity::new);
        tesseract = new OmegaUnitType("tesseract"){{

            range = 300;
            flying = true;
            hitSize = 17.5;
            rotateSpeed = 2;
            lowAltittude = true;
            health = 24000;
            armor = 20;
            speed = 1.5;
            drag = 0.005;
            engineSize = 0;
            ammoType = new ItemAmmoType(Items.phaseFabric);

            constructor = OmegaUnitEntity::new;

            abilities.add(new SeperateAbility(flare, 21, 0)
        }};
    }};
}};
        Ene