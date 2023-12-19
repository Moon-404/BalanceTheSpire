package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.LegSweep;

@SpirePatch(clz = LegSweep.class, method = "upgrade")
public class LegSweepUpgrade {
    public static void Prefix(LegSweep __instance) {
        if (!__instance.upgraded) {
            __instance.baseBlock += 1;
        }
    }
}
