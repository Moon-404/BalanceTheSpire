package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BlackBlood;

@SpirePatch(clz = BlackBlood.class, method = "getUpdatedDescription")
public class BlackBloodDescription {
    public static String Replace(BlackBlood __instance) {
        return __instance.DESCRIPTIONS[0] + 15 + __instance.DESCRIPTIONS[1];
    }
}
