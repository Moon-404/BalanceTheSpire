package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.FlyingKnee;

@SpirePatch(clz = FlyingKnee.class, method = SpirePatch.CONSTRUCTOR)
public class FlyingKneeBase {
    public static void Postfix(FlyingKnee __instance) {
        __instance.baseDamage += 1;
    }
}
