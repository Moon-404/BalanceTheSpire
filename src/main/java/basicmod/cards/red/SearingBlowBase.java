package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.SearingBlow;

@SpirePatch(clz = SearingBlow.class, method = SpirePatch.CONSTRUCTOR, paramtypez = {int.class})
public class SearingBlowBase {
    public static void Postfix(SearingBlow __instance) {
        __instance.baseDamage += 2;
    }
}
