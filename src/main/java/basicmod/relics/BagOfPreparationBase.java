package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BagOfPreparation;
import com.megacrit.cardcrawl.relics.AbstractRelic.RelicTier;

@SpirePatch(clz = BagOfPreparation.class, method = SpirePatch.CONSTRUCTOR)
public class BagOfPreparationBase {
    public static void Postfix(BagOfPreparation __instance) {
        __instance.tier = RelicTier.UNCOMMON;
    }
}
