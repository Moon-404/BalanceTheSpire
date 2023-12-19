package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.LegSweep;

@SpirePatch(clz = LegSweep.class, method = SpirePatch.CONSTRUCTOR)
public class LegSweepBase {
    public static void Postfix(LegSweep __instance) {
        __instance.baseBlock += 1;
    }
}
