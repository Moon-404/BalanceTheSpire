package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.FireBreathing;

@SpirePatch(clz = FireBreathing.class, method = SpirePatch.CONSTRUCTOR)
public class FireBreathingBase {
    public static void Postfix(FireBreathing __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
