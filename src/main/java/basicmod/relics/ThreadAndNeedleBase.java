package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.ThreadAndNeedle;
import com.megacrit.cardcrawl.relics.AbstractRelic.RelicTier;

@SpirePatch(clz = ThreadAndNeedle.class, method = SpirePatch.CONSTRUCTOR)
public class ThreadAndNeedleBase {
    public static void Postfix(ThreadAndNeedle __instance) {
        __instance.tier = RelicTier.UNCOMMON;
    }
}
