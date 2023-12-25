package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.LikeWater;

@SpirePatch(clz = LikeWater.class, method = SpirePatch.CONSTRUCTOR)
public class LikeWaterBase {
    public static void Postfix(LikeWater __instance) {
        __instance.baseMagicNumber = 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
