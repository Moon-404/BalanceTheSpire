package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.FlyingKnee;

@SpirePatch(clz = FlyingKnee.class, method = "upgrade")
public class FlyingKneeUpgrade {
    public static void Prefix(FlyingKnee __instance) {
        if (!__instance.upgraded) {
            __instance.baseDamage += 1;
        }
    }
}
