package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.SuckerPunch;

@SpirePatch(clz = SuckerPunch.class, method = SpirePatch.CONSTRUCTOR)
public class SuckerPunchBase {
    public static void Postfix(SuckerPunch __instance) {
        __instance.baseDamage += 2;
    }
}
