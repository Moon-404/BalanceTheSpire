package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.ThunderClap;

@SpirePatch(clz = ThunderClap.class, method = "upgrade")
public class ThunderClapUpgrade {
    public static void Prefix(ThunderClap __instance) {
        if (!__instance.upgraded) {
            __instance.baseDamage -= 2;
            __instance.baseMagicNumber = 2;
            __instance.magicNumber = __instance.baseMagicNumber;
            __instance.upgradedMagicNumber = true;
        }
    }
}
