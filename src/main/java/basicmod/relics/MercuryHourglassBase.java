package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MercuryHourglass;
import com.megacrit.cardcrawl.relics.AbstractRelic.RelicTier;

@SpirePatch(clz = MercuryHourglass.class, method = SpirePatch.CONSTRUCTOR)
public class MercuryHourglassBase {
    public static void Postfix(MercuryHourglass __instance) {
        __instance.tier = RelicTier.COMMON;
    }
}
