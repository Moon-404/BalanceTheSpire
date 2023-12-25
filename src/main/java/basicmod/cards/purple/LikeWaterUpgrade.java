package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.LikeWater;

@SpirePatch(clz = LikeWater.class, method = "upgrade")
public class LikeWaterUpgrade {
    public static void Postfix(LikeWater __instance) {
        if (!__instance.upgraded) {
            __instance.baseMagicNumber -= 1;
            __instance.magicNumber -= 1;
        }
    }
}
