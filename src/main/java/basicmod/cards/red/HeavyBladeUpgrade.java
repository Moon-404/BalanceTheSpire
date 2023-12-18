package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.HeavyBlade;

@SpirePatch(clz = HeavyBlade.class, method = "upgrade")
public class HeavyBladeUpgrade {
    public static void Prefix(HeavyBlade __instance) {
        if (!__instance.upgraded) {
            __instance.upgradedDamage = true;
            __instance.baseDamage += 2;
        }
    }
}
