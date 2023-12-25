package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Rupture;

@SpirePatch(clz = Rupture.class, method = SpirePatch.CONSTRUCTOR)
public class RuptureBase {
    public static void Postfix(Rupture __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
