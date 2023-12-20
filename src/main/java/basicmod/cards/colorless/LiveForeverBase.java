package basicmod.cards.colorless;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.optionCards.LiveForever;

@SpirePatch(clz = LiveForever.class, method = SpirePatch.CONSTRUCTOR)
public class LiveForeverBase {
    public static void Postfix(LiveForever __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
