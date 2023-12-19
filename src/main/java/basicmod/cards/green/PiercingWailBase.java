package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.PiercingWail;

@SpirePatch(clz = PiercingWail.class, method = SpirePatch.CONSTRUCTOR)
public class PiercingWailBase {
    public static void Postfix(PiercingWail __instance) {
        __instance.baseMagicNumber -= 1;
        __instance.magicNumber -= 1;
    }
}
