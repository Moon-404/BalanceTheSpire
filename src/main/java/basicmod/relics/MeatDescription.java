package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MeatOnTheBone;

@SpirePatch(clz = MeatOnTheBone.class, method = "getUpdatedDescription")
public class MeatDescription {
    public static String Replace(MeatOnTheBone __instance) {
        return __instance.DESCRIPTIONS[0] + 10 + __instance.DESCRIPTIONS[1];
    }
}
