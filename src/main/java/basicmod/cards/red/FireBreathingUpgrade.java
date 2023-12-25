package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.FireBreathing;

@SpirePatch(clz = FireBreathing.class, method = "upgrade")
public class FireBreathingUpgrade {
    public static void Prefix(FireBreathing __instance) {
        if (!__instance.upgraded) {
            __instance.baseMagicNumber += 1;
            __instance.magicNumber = __instance.baseMagicNumber;
        }
    }
}
