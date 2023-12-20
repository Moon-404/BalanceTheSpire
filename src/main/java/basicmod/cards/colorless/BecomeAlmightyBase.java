package basicmod.cards.colorless;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.optionCards.BecomeAlmighty;

@SpirePatch(clz = BecomeAlmighty.class, method = SpirePatch.CONSTRUCTOR)
public class BecomeAlmightyBase {
    public static void Postfix(BecomeAlmighty __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
