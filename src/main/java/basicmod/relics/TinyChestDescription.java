package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.TinyChest;

@SpirePatch(clz = TinyChest.class, method = "getUpdatedDescription")
public class TinyChestDescription {
    public static String Replace(TinyChest __instance) {
        return __instance.DESCRIPTIONS[0] + 3 + __instance.DESCRIPTIONS[1];
    }
}
