package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.WhiteBeast;
import com.megacrit.cardcrawl.relics.AbstractRelic.RelicTier;

@SpirePatch(clz = WhiteBeast.class, method = SpirePatch.CONSTRUCTOR)
public class WhiteBeastBase {
    public static void Postfix(WhiteBeast __instance) {
        __instance.tier = RelicTier.RARE;
    }
}
